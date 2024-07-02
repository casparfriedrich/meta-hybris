FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI:append = " \
	file://10-usb0.network \
	"

FILES:${PN}:append = " \
	${sysconfdir}/systemd/network/10-usb0.network \
	"

do_install:append() {
	install -D -t ${D}${sysconfdir}/systemd/network -m 0644 ${WORKDIR}/10-usb0.network
}
