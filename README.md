#meta-audiobox-distro

## Introduction
meta-audiobox-distro is a layer containing the metadata for the MP1 AudioBox distribution, based on Yocto and OE.

## DISTRO
meta-audiobox-distro provides a single distro:
* **audiobox-distro**:

## Images
meta-audiobox-distro provides two images to be used mainly with **audiobox-weston** distro:
* **audiobox-image**:
Basic core image with: ssh server, several tools for kernel, audio, calf audio effects manager and guitarix.
* **audiobox-image-weston**:
Image with Wayland/weston UI and all the features of audiobox-image. 


