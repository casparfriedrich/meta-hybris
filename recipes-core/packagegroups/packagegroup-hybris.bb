inherit packagegroup

PACKAGES = " \
    packagegroup-hybris \
    packagegroup-hybris-extended \
"

RDEPENDS:packagegroup-hybris = " \
"

RRECOMMENDS:packagegroup-hybris = " \
    curl \
    strace \
    vim \
    wget \
"

RDEPENDS:packagegroup-hybris-extended = " \
    packagegroup-hybris \
    \
    ${@bb.utils.contains("MACHINE_FEATURES", "serial", "tio", "", d)} \
"

RRECOMMENDS:packagegroup-hybris-extended = " \
"
