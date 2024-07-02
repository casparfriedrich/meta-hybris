FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

# KBRANCH:beaglebone-hybris = ""

KMACHINE:beaglebone-hybris ?= "beaglebone"

# SRCREV_machine:beaglebone-hybris ?= ""

COMPATIBLE_MACHINE:beaglebone-hybris = "beaglebone-hybris"

# LINUX_VERSION:beaglebone-hybris = ""

SRC_URI:append = " \
	file://3g.scc \
	"

KERNEL_FEATURES:append:beaglebone-hybris = " \
	${@bb.utils.contains('MACHINE_FEATURES', '3g', '3g.scc', '', d)} \
	${@bb.utils.contains('MACHINE_FEATURES', 'usbgadget', 'features/usb/usb-gadgets.scc', '', d)} \
	features/usb/serial-all.scc \
	"
