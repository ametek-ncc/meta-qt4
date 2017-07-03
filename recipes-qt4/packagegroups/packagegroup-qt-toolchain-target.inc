LICENSE = "MIT"

# Qt4 could NOT be built on MIPS64 with 64 bits userspace
COMPATIBLE_HOST_mips64 = "null"

inherit packagegroup

PACKAGEGROUP_DISABLE_COMPLEMENTARY = "1"

RDEPENDS_${PN} += " \
        packagegroup-core-standalone-sdk-target \
        qt4${QTLIBPREFIX}-mkspecs \
        libqt${QTLIBPREFIX}core4-dev \
        libqt${QTLIBPREFIX}dbus4-dev \
        libqt${QTLIBPREFIX}gui4-dev \
        libqt${QTLIBPREFIX}help4-dev \
        libqt${QTLIBPREFIX}network4-dev \
        libqt${QTLIBPREFIX}sql4-dev \
        libqt${QTLIBPREFIX}xml4-dev \
        libqt${QTLIBPREFIX}xmlpatterns4-dev \
        libsqlite3-dev \
        expat-dev \
        "

RRECOMMENDS_${PN} += " \
        libqt${QTLIBPREFIX}phonon4-dev \
        "
