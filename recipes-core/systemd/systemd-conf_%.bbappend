FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI:append = " \
	file://gadget.network \
	"

do_install:append() {
	install -D -m0644 ${WORKDIR}/gadget.network ${D}${systemd_unitdir}/network/10-gadget.network
}
