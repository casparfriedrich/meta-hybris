COMPATIBLE_MACHINE:beaglebone-hybris = "beaglebone-hybris"
COMPATIBLE_MACHINE:phyboard-hybris = "phyboard-hybris"

KMACHINE:beaglebone-hybris = "ti-am335x"
KMACHINE:phyboard-hybris = "nxp-imx6"

KERNEL_FEATURES:append = " \
	${@bb.utils.contains('MACHINE_FEATURES', 'usbgadget', 'features/usb/usb-gadgets.scc', '', d)} \
	"

KERNEL_FEATURES:append:beaglebone-hybris = " \
	features/nfsd/nfsd-enable.scc \
	features/usb/serial-all.scc \
	"
