LICENSE = "CLOSED"

SRC_URI:append = " \
    file://usb0.link \
    file://usb0.network \
"

S = "${UNPACKDIR}"

do_install() {
    install -D -m 0644 ${S}/usb0.link ${D}${systemd_unitdir}/network/00-usb0.link
    install -D -m 0644 ${S}/usb0.network ${D}${systemd_unitdir}/network/00-usb0.network
}

FILES:${PN}:append = " \
    ${systemd_unitdir}/network/00-usb0.link \
    ${systemd_unitdir}/network/00-usb0.network \
"
