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

RDEPENDS:packagegroup-hybris-extended = " \
	packagegroup-hybris \
	\
	tio \
"
