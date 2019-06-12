import json

def install(package):
	try:
		from pip._internal import main as pipmain
		pipmain(['install', package])
	except EnvironmentError:
		print("Could not install", package)

with open("dependencies.json") as dep:
	d = json.load(dep)
	for i,j in zip(d["Dependencies"].keys(), d["Dependencies"].values()):
		end = "{}=={}\n".format(i, j)
		install(end)