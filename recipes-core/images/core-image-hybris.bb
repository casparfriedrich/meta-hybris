inherit core-image

IMAGE_FEATURES:append = " \
	allow-empty-password \
	allow-root-login \
	empty-root-password \
	package-management \
	serial-autologin-root \
	ssh-server-openssh \
"
