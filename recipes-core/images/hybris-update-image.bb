LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

IMAGE_DEPENDS = "hybris-image"

SWUPDATE_IMAGES = "hybris-image"

SWUPDATE_IMAGES_FSTYPES[hybris-image] = ".ext4.gz"

inherit swupdate