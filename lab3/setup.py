from distutils.core import setup, Extension

setup(name="example",
      version="1.0",
      ext_modules=[Extension("example", ["example_library.cpp"])])