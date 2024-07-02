COMPATIBLE_MACHINE:beaglebone-hybris = "beaglebone-hybris"

KMACHINE:beaglebone-hybris = "beaglebone"

KERNEL_FEATURES:append = " \
    features/nfsd/nfsd-enable.scc \
"

KERNEL_FEATURES:append:beaglebone-hybris = " \
    features/leds/leds.scc \
"
