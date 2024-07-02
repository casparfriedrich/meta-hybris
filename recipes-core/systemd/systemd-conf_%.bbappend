FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI:append = " \
	file://gadget.network \
"

do_install:append() {
	install -D -m0644 ${S}/gadget.network ${D}${systemd_unitdir}/network/80-gadget.network
}
