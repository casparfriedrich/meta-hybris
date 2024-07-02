require recipes-core/images/hybris-image-base.bb

IMAGE_FEATURES:append = " \
    nfs-server \
"

IMAGE_INSTALL:append = " \
    sae-nfs-exports \
    sae-wired-network \
"
