#include <iostream>
#include <Python.h>

static PyObject *example_hello(PyObject *self, PyObject *args)
{
  const char *name;

  if (!PyArg_ParseTuple(args, "s", &name))
  {
    return NULL;
  }

  std::cout << "Hello, " << name << "!" << std::endl;

  Py_RETURN_NONE;
}

static PyMethodDef example_methods[] = {
    {"hello", example_hello, METH_VARARGS, "Prints a greeting."},
    {NULL, NULL, 0, NULL}};

static struct PyModuleDef example_module = {
    PyModuleDef_HEAD_INIT,
    "example",
    "Example module",
    -1,
    example_methods};

PyMODINIT_FUNC PyInit_example(void)
{
  return PyModule_Create(&example_module);
}