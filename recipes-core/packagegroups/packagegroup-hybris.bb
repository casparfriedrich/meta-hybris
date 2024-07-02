inherit packagegroup

PACKAGES = " \
    packagegroup-hybris \
    packagegroup-hybris-extended \
"

RDEPENDS:packagegroup-hybris = " \
    exfat-utils \
"

RRECOMMENDS:packagegroup-hybris = " \
    curl \
    strace \
    vim \
    wget \
"

RDEPENDS:packagegroup-hybris-extended = " \
    packagegroup-hybris \
"

RRECOMMENDS:packagegroup-hybris-extended = " \
    haproxy \
    tio \
"
