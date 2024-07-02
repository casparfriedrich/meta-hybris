inherit core-image

IMAGE_FEATURES += " \
	allow-empty-password \
	allow-root-login \
	empty-root-password \
	package-management \
	serial-autologin-root \
	ssh-server-openssh \
	"

IMAGE_INSTALL += " \
	"
