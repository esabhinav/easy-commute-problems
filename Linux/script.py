import json
import os
start = "pip install "
with open("dependencies.json") as dep:
	d = json.load(dep)
	for i,j in zip(d["Dependencies"].keys(), d["Dependencies"].values()):
		end = "{}=={}\n".format(i, j)
		line = start + end
		os.system(line)