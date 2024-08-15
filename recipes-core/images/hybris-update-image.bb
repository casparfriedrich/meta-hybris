LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI:append = " \
	file://emmcsetup.lua \
	file://sw-description \
	"

IMAGE_DEPENDS = "hybris-image"

SWUPDATE_IMAGES = "hybris-image"

SWUPDATE_IMAGES_FSTYPES[hybris-image] = ".rootfs.ext4.gz"

inherit swupdate
