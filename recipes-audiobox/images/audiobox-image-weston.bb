SUMMARY = "MP1 audiobox image"

LICENSE = "MIT"

REQUIRED_DISTRO_FEATURES = "wayland"

inherit core-image

# ALSA lib and utilities
IMAGE_INSTALL += "alsa-lib"
IMAGE_INSTALL += "alsa-utils-alsamixer alsa-utils-alsactl alsa-utils-aplay alsa-utils-amixer"
IMAGE_INSTALL += "jack-server"
IMAGE_INSTALL += "weston"
IMAGE_INSTALL += "weston-init"
IMAGE_INSTALL += "weston-examples"
IMAGE_INSTALL += "gtk+3"
IMAGE_INSTALL += "gtk+3-demo"

