FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

# KBRANCH:beaglebone-hybris = "v6.17/standard/beaglebone"

KMACHINE:beaglebone-hybris ?= "beaglebone"

# SRCREV_machine:beaglebone-hybris ?= ""

COMPATIBLE_MACHINE:beaglebone-hybris = "beaglebone-hybris"

# LINUX_VERSION:beaglebone-hybris = ""

SRC_URI:append:beaglebone-hybris = " \
	file://usb-gadget-eth.scc \
	"

KERNEL_FEATURES:append:beaglebone-hybris = " \
	features/gpio/sysfs.scc \
	features/leds/leds.scc \
	\
	${@bb.utils.contains('MACHINE_FEATURES', 'usbgadget', 'usb-gadget-eth.scc', '', d)} \
	"
