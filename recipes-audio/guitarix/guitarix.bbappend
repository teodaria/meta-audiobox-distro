

EXTRA_OECONF += " \
    --cxxflags-release='-mcpu=cortex-a7 -mfpu=neon -O3 -ffast-math -funsafe-math-optimizations' \   
    --convolver-ffmpeg \     
"

DEPENDS += " \
   ffmpeg \
"

FULL_OPTIMIZATION = "-O3 -pipe ${DEBUG_FLAGS}"



