LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0e1a95b7892d3015ecd6d0016f601f2c"

inherit meson pkgconfig

SRC_URI = "https://github.com/tio/tio/releases/download/v${PV}/${BPN}-${PV}.tar.xz"
SRC_URI[sha256sum] = "a24c69e59b53cf72a147db2566b6ff3b6a018579684caa4b16ce36614b2b68d4"

DEPENDS:append = " \
	glib-2.0 \
	lua \
	"

RDEPENDS:${PN}:append = " \
	lua \
	"

EXTRA_OEMESON:append = " \
	-Dbashcompletiondir=no \
	"
