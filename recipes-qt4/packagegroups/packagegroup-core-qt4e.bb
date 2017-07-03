SUMMARY = "Qt for Embedded Linux (Qt without X11)"
PR = "r2"
LICENSE = "MIT"

# Qt4 could NOT be built on MIPS64 with 64 bits userspace
COMPATIBLE_HOST_mips64 = "null"

inherit packagegroup

TOUCH = ' ${@bb.utils.contains("MACHINE_FEATURES", "touchscreen", "tslib tslib-calibrate tslib-tests qt4-embedded-plugin-mousedriver-tslib", "",d)}'

RDEPENDS_${PN} = " \
	qt4-embedded \
	libqt-embeddedcore4 \
	libqt-embeddeddbus4 \
	libqt-embeddedgui4 \
	libqt-embeddedhelp4 \
	libqt-embeddednetwork4 \
	libqt-embeddedsql4 \
	libqt-embeddedxml4 \
	qt4-embedded-fonts-ttf-dejavu \
	qt4-embedded-fonts-ttf-vera \
	qt4-embedded-plugin-imageformat-gif \
	qt4-embedded-plugin-script-dbus \
	qt4-embedded-plugin-sqldriver-sqlite \
        qt4-embedded-demos \
        qt4-embedded-examples \
        qt-demo-init \
        qt4-embedded-assistant \
"

RRECOMMENDS_${PN} = " \
	libqt-embeddedxmlpatterns4 \
	qt4-embedded-plugin-phonon-backend-gstreamer \
	${TOUCH} \
"

