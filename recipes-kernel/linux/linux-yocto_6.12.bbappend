FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

# KBRANCH:beaglebone-hybris = "v6.12/standard/base"

KMACHINE:beaglebone-hybris ?= "ti-am335x"

# SRCREV_machine:beaglebone-hybris ?= ""

COMPATIBLE_MACHINE:beaglebone-hybris = "beaglebone-hybris"

# LINUX_VERSION:beaglebone-hybris = ""

SRC_URI:append = " \
	file://usb-gadget-eth.scc \
"

KERNEL_FEATURES:append = " \
	features/gpio/sysfs.scc \
	features/leds/leds.scc \
	\
	${@bb.utils.contains('MACHINE_FEATURES', 'usbgadget', 'usb-gadget-eth.scc', '', d)} \
"
