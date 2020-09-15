SUMMARY = "MP1 audiobox image"

LICENSE = "MIT"

inherit core-image

# ALSA lib and utilities
IMAGE_INSTALL += "alsa-lib"
IMAGE_INSTALL += "alsa-utils-alsamixer alsa-utils-alsactl alsa-utils-aplay alsa-utils-amixer"
IMAGE_INSTALL += "jack-server"
