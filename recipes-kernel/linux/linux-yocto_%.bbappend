FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

# KBRANCH:beaglebone-hybris = ""
# KBRANCH:phyboard-hybris = ""

KMACHINE:beaglebone-hybris ?= "ti-am335x"
KMACHINE:phyboard-hybris ?= "nxp-imx6"

# SRCREV_machine:beaglebone-hybris ?= ""
# SRCREV_machine:phyboard-hybris ?= ""

COMPATIBLE_MACHINE:beaglebone-hybris = "beaglebone-hybris"
COMPATIBLE_MACHINE:phyboard-hybris = "phyboard-hybris"

SRC_URI:append = " \
	file://3g.scc \
	"

KERNEL_FEATURES:append = " \
	${@bb.utils.contains('MACHINE_FEATURES', '3g', '3g.scc', '', d)} \
	${@bb.utils.contains('MACHINE_FEATURES', 'usbgadget', 'features/usb/usb-gadgets.scc', '', d)} \
	"

KERNEL_FEATURES:append:beaglebone-hybris = " \
	features/nfsd/nfsd-enable.scc \
	features/usb-net/usb-net.scc \
	features/usb/serial-all.scc \
	"
