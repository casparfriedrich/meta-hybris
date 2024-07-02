IMAGE_FEATURES += " \
    ssh-server-openssh \
    package-management \
    "

inherit core-image

IMAGE_INSTALL += " \
    packagegroup-core-full-cmdline \
    tio \
    "
