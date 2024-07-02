COMPATIBLE_MACHINE:beaglebone-hybris = "beaglebone-hybris"
# COMPATIBLE_MACHINE:phyboard-hybris = "phyboard-hybris"

KBRANCH:beaglebone-hybris = "v6.6/standard/ti-sdk-6.6/ti-soc"
# KBRANCH:phyboard-hybris = "v6.6/standard/nxp-sdk-6.6/nxp-soc"

KMACHINE:beaglebone-hybris ?= "ti-am335x"
# KMACHINE:phyboard-hybris ?= "nxp-imx6"

KERNEL_FEATURES:append = " ${@bb.utils.contains('MACHINE_FEATURES', 'usbgadget', 'features/usb/usb-gadgets.scc', '', d)}"
