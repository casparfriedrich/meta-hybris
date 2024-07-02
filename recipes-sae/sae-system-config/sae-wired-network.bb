LICENSE = "CLOSED"

SRC_URI = " \
    file://eth0-sae.network \
"

S = "${UNPACKDIR}"

do_install() {
    install -D -m 0644 ${S}/eth0-sae.network ${D}${systemd_unitdir}/network/00-eth0-sae.network
}

FILES:${PN}:append = " \
    ${systemd_unitdir}/network/00-eth0-sae.network \
"
