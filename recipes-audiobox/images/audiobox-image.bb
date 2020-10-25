SUMMARY = "MP1 audiobox image"

LICENSE = "MIT"
IMAGE_LINGUAS = "en-us"

inherit core-image

IMAGE_INSTALL += "alsa-lib"
IMAGE_INSTALL += "alsa-utils-aconnect alsa-utils-alsamixer alsa-utils-alsactl alsa-utils-aplay alsa-utils-amixer alsa-utils"
IMAGE_INSTALL += "jack-server"
IMAGE_INSTALL += "qjackctl"
IMAGE_INSTALL += "calf"
IMAGE_INSTALL += "guitarix"
IMAGE_INSTALL += "fb-test"
IMAGE_INSTALL += "libdrm"
IMAGE_INSTALL += "libdrm-tests "
IMAGE_INSTALL += "openssh openssh-sshd"
IMAGE_INSTALL += "xauth"

EXTRA_IMAGE_FEATURES = " \
    debug-tweaks \
    tools-debug \
    eclipse-debug \
    "

IMAGE_INSTALL_append = " \
    tcf-agent \
    openssh-sftp-server \
    "
