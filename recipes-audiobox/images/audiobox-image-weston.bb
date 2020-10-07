SUMMARY = "MP1 audiobox image"

LICENSE = "MIT"

REQUIRED_DISTRO_FEATURES = "wayland"

inherit core-image

# ALSA lib and utilities
IMAGE_INSTALL += "alsa-lib"
IMAGE_INSTALL += "alsa-utils-alsamixer alsa-utils-alsactl alsa-utils-aplay alsa-utils-amixer"
IMAGE_INSTALL += "jack-server"
IMAGE_INSTALL += "weston"
#IMAGE_INSTALL += "weston-init"
#IMAGE_INSTALL += "weston-examples"
IMAGE_INSTALL += "gtk+3"
IMAGE_INSTALL += "weston-xwayland"
IMAGE_INSTALL += "libx11-locale"
IMAGE_INSTALL += "libx11"
IMAGE_INSTALL += "libxcb"
IMAGE_INSTALL += "libxcursor"
IMAGE_INSTALL += "xf86-input-evdev"
IMAGE_INSTALL += "xf86-input-mouse"
IMAGE_INSTALL += "xf86-input-keyboard"
IMAGE_INSTALL += "xclock"
IMAGE_INSTALL += "xeyes"
IMAGE_INSTALL += "xinput"
IMAGE_INSTALL += "xkbcomp"
IMAGE_INSTALL += "xorg-minimal-fonts"
IMAGE_INSTALL += "xterm"
IMAGE_INSTALL += "xserver-xorg"
IMAGE_INSTALL += "xinit"
IMAGE_INSTALL += "guitarix"
IMAGE_INSTALL += "fb-test"
IMAGE_INSTALL += "libdrm"
IMAGE_INSTALL += "libdrm-tests "
IMAGE_INSTALL += "xvinfo"
IMAGE_INSTALL += "glmark2"
#IMAGE_INSTALL += "netdata"
IMAGE_INSTALL += "lmsensors-libsensors"
IMAGE_INSTALL += "lmsensors-sensors"
IMAGE_INSTALL += "x11perf"
IMAGE_INSTALL += "gtkperf"
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

