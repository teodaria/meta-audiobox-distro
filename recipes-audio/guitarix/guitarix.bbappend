EXTRA_OECONF += " \
    --cxxflags-release='-mcpu=cortex-a7 -mfpu=neon -O3 -ffast-math -funsafe-math-optimizations' \   
"

#    --convolver-ffmpeg \     
#DEPENDS += " \
#   ffmpeg \
#"

FULL_OPTIMIZATION = "-O3 -pipe ${DEBUG_FLAGS}"

do_install_append() {
    install -d ${D}/home/root/.config
}

FILES_${PN} += "/home/root/.config"


