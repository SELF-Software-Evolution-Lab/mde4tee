

## Folder Descriptions

### `mainworkspace/01-metamodel/`

Contains everything related to the **metamodel**, including:

- `basic/`: Ecore definitions and core modeling concepts.
- `edit/`: Auto-generated EMF edit plugin.
- `editor/`: Auto-generated EMF editor plugin.

### `mainworkspace/02-codegenerator/`

Contains the **Acceleo code generation** module. It transforms models into secure C code suitable for deployment on the Morello Board.

### `runtimeworkspace/01-model/`

Contains the **graphical models** built using Sirius, based on the metamodel. These models define the structure and logic of the integration solution to be generated.

## How to Use

1. Open the project in **Obeo Designer** or **Eclipse with Sirius and Acceleo plugins** installed.
2. Load the metamodel from `01-metamodel`.
3. Use Sirius to create models in `01-model`.
4. Run the Acceleo generator from `02-codegenerator` to produce C code.

---

## Target Platform

- **Morello Board**
- **CHERI Architecture**
- Code generation output: Secure C code using TEE patterns

---
