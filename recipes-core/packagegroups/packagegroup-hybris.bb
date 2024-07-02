inherit packagegroup

PACKAGES = " \
    packagegroup-hybris \
    packagegroup-hybris-extended \
"

RDEPENDS:packagegroup-hybris = " \
    curl \
    strace \
    vim \
    wget \
"

RRECOMMENDS:packagegroup-hybris = " \
    tio \
"

RDEPENDS:packagegroup-hybris-extended = " \
    node-red \
"

RRECOMMENDS:packagegroup-hybris-extended = " \
"
