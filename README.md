# DSL for IoT systems in the Underground coal mine industry
Repository to host a DSL for modeling multi-layered and self-adapting IoT systems for underground coal mines implemented in [MPS](https://www.jetbrains.com/es-es/mps/).

> _ This DSL is an extension of our domain-specific language presented in this [paper](https://doi.org/10.1109/MODELS-C53483.2021.00122), to define the structure of an underground coal mine, the multilayer IoT system and the adaptation rules to guarantee QoS.._

You can find in this repository the DSL implemented in MPS, a sandbox model of an example mine (Figure 1 shows the mine structure model) with an IoT system, including a control point, sensors, actuators, nodes (edge, fog, and cloud), and adaptation rules. You can also find the generated code for K3S (lightweight Kubernetes distribution) in [this directory](https://github.com/SOM-Research/IoT-Mining-DSL/tree/main/languages/Mining/sandbox/source_gen/Mining/sandbox).

<img src="https://github.com/SOM-Research/IoT-Mining-DSL/tree/main/images/mine-structure-model.png" alt="Mine structure model" caption="Fig 1. Mine structure model" style="height: 80%; width:80%;"/>

The metamodel (concrete syntax) of the DSL is summarised in the following Figure.

<img src="https://github.com/SOM-Research/IoT-Mining-DSL/tree/main/images/metamodel.png" alt="Metamodel" caption="Fig 1. Metamodel" style="height: 80%; width:80%;"/>

## Prerequisites

To run this DSL in MPS you need the following prerequisites:

* [Jetbrains MPS 2021.2.2](https://www.jetbrains.com/es-es/mps/) or above.
* [mbeddr platform](http://mbeddr.com/) (MPS plugin)
* [plaintext-gen](https://jetbrains.github.io/MPS-extensions/extensions/plaintext-gen/) (MPS plugin)
* MPS Table Editor Component (MPS plugin)

Or you can find the installation and configuration [guide here.](https://github.com/SOM-Research/IoT-Mining-DSL/tree/main/installation-guide.pdf)