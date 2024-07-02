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
	ext4.xz \
	"

SWUPDATE_IMAGES_FSTYPES[hybris-image] = ".ext4.xz"

inherit core-image
inherit swupdate-image
