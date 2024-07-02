DESCRIPTION = "HAProxy is a free, very fast and reliable reverse-proxy offering high availability, \
load balancing, and proxying for TCP and HTTP-based applications."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2d862e836f92129cdc0ecccc54eed5e0"

DEPENDS = " \
    openssl \
"

SRC_URI = " \
    git://git.haproxy.org/git/haproxy-3.4.git;protocol=https;branch=master;tag=v${PV} \
"

SRCREV = "56332c50b5291cfbbfd440d958adc988fbf87e2f"

EXTRA_OEMAKE = "TARGET=linux-glibc USE_OPENSSL=1 USE_ENGINE=1 USE_LIBCRYPT=0"

do_compile() {
    # These variables must be set explicitly because they are predefined in the Makefile and cannot be overridden by environment variables
    oe_runmake CC="${CC}" CFLAGS="${CFLAGS}" LDFLAGS="${LDFLAGS}"
}

do_install() {
    install -D -m 0755 ${B}/haproxy ${D}${bindir}/haproxy
}

INSANE_SKIP:${PN} += "buildpaths"
