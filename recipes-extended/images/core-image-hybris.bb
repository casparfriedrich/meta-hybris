inherit core-image

IMAGE_FEATURES += " \
    ssh-server-openssh \
    package-management \
    "

IMAGE_INSTALL += " \
    tio \
    "
