SUMMARY = "Low-code programming for event-driven applications"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=014f1a23c3da49aa929b21a96808ab22"

SRC_URI = " \
	npm://registry.npmjs.org;package=node-red;version=${PV} \
"

S = "${WORKDIR}/npm"

inherit npm
