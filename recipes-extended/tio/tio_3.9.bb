LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d25b0ab86d83b943da4d25251a2c21d7"

inherit meson pkgconfig

SRC_URI = "https://github.com/tio/tio/releases/download/v${PV}/${BPN}-${PV}.tar.xz"
SRC_URI[sha256sum] = "06fe0c22e3e75274643c017928fbc85e86589bc1acd515d92f98eecd4bbab11b"

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
