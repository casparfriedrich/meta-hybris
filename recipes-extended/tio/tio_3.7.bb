LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0e1a95b7892d3015ecd6d0016f601f2c"

inherit meson pkgconfig

SRC_URI = "https://github.com/tio/tio/releases/download/v${PV}/${BPN}-${PV}.tar.xz"
SRC_URI[sha256sum] = "dbaef5dc6849229ce4eb474d4de77a7302cd2b0657731a8df86a44dd359e6afb"

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
