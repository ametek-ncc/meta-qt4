DESCRIPTION = "An image that will launch into the demo application for the embedded (not based on X11) version of Qt."
LICENSE = "MIT"
PR = "r3"

LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

IMAGE_INSTALL += "\
	${CORE_IMAGE_BASE_INSTALL} \
	packagegroup-core-qt4e \
"

IMAGE_ROOTFS_SIZE = "3984588"

inherit core-image

