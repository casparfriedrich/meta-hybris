FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI:append = " \
	file://dummy.cfg \
	"

KERNEL_CONFIG_FRAGMENTS:append = " \
	${WORKDIR}/dummy.cfg \
	"
