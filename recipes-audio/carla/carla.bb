SUMMARY = "My Audio plugin host"
HOMEPAGE = "http://kxstudio.linuxaudio.org/Applications:Carla"
LICENSE = "GPLv2 & LGPLv3"
LIC_FILES_CHKSUM = " \
    file://doc/GPL.txt;md5=4641e94ec96f98fabc56ff9cc48be14b \
    file://doc/LGPL.txt;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

SRC_URI = " \
    git://github.com/falkTX/Carla.git;nobranch=1 \
"
SRCREV = "a72dbc9872e61fa54c293188a6cf27c92f72850d"
S = "${WORKDIR}/git"
PV = "2.2.0"
REQUIRED_DISTRO_FEATURES = "x11"

inherit qmake5_base pkgconfig qemu-ext-musicians features_check mime mime-xdg gtk-icon-cache

B = "${S}"

DEPENDS += " \
    python3-pyqt5-native \
    qtbase-native \
    qtbase \
    gtk+ \
    gtk+3 \
    liblo \
    pulseaudio \
    fluidsynth \
    libsndfile1 \
    mesa \
"

EXTRA_OEMAKE += " \
    DEFAULT_QT=5 \
    NOOPT=true \
    HAVE_PYQT=true \
    HAVE_PYQT4=false \
    HAVE_PYQT5=true \
    SKIP_STRIPPING=true \
"

RDEPENDS_${PN} += "python3-pyqt5 bash"
