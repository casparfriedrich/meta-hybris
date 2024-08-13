IMAGE_FEATURES:append = " \
    debug-tweaks \
    package-management \
    ssh-server-openssh \
    tools-debug \
    "

IMAGE_INSTALL:append = " \
    curl \
    htop \
    mosquitto \
    swupdate \
    tio \
    util-linux \
    vim \
    wget \
    "

IMAGE_FSTYPES:append = " \
    ext4.gz \
    "

inherit core-image
