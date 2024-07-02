LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0e1a95b7892d3015ecd6d0016f601f2c"

inherit meson pkgconfig

SRC_URI = "https://github.com/tio/tio/releases/download/v${PV}/${BPN}-${PV}.tar.xz"
SRC_URI[sha256sum] = "efd3e9a406f827ac22d4157e345079dde15ee5a948b24156561d6c97a54e6ec0"

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
