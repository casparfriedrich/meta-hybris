LICENSE = "CLOSED"

SRC_URI = " \
    file://exports \
"

S = "${UNPACKDIR}"

do_install() {
    install -d ${D}/rootfs_335_v4
    install -d ${D}/rootfs_yk_fw5e
    install -d ${D}/rootfs_yk_m5
    install -d ${D}/rootfs_yk_ydrix
    install -D -m 0644 exports ${D}${sysconfdir}/exports
}

RRECOMMENDS:${PN} = " \
    packagegroup-core-nfs-server \
"

FILES:${PN}:append = " \
    /rootfs_335_v4 \
    /rootfs_yk_fw5e \
    /rootfs_yk_m5 \
    /rootfs_yk_ydrix \
"
