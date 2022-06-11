// Stars of Theta Orionis Cluster
// Reference: https://en.wikipedia.org/wiki/Theta_Orionis

// ----------A's components---------- //
Barycenter "TET1 Ori A1-A3"
{
	ParentBody "TET1 Ori A"
	BinaryOrbit
	{
		Separation      90
	}
}

Star "TET1 Ori A1"
{
	ParentBody "TET1 Ori A1-A3"
	Class      "B0.5V"
	MassSol    15.3
  RadSol     4.5
	Luminosity 16200
  Teff       30700

	BinaryOrbit
	{
		PeriodDays      65.4314
		Epoch           2444195.578
		Eccentricity    0.626
    Separation      1
		ArgOfPericenter 3.3
		MeanAnomaly     0
	}
}

Star "TET1 Ori A3"
{
	ParentBody "TET1 Ori A1-A3"
	Class      "A" // Pre-main sequence star
	MassSol    2.5 // 2.7

  /* Orbit
	{
		PeriodDays      65.4314
		Epoch           2444195.578
		Eccentricity    0.626
    Separation      1
		ArgOfPericenter 183.3
		MeanAnomaly     0
	} */
}

Star "TET1 Ori A2"
{
	ParentBody "TET1 Ori A"
	Class      ""
  MassSol    4

  /* BinaryOrbit
	{
		Separation      90
	} */
}

// ----------B's components---------- //

Barycenter "TET1 Ori B145"
{
	ParentBody "TET1 Ori B"
	BinaryOrbit
	{
		Separation      385.227
	}
}

Barycenter "TET1 Ori B2-B3"
{
	ParentBody "TET1 Ori B"
	/* BinaryOrbit
	{
		Separation      385.227
	} */
}

Star "TET1 Ori B1"
{
	ParentBody "TET1 Ori B145"
	Class      "B1V"
	MassSol    6
  RadSol     3
	Luminosity 776
  Teff       19320

	Orbit
	{
		PeriodDays      6.471
		Epoch           2440265.34
		ArgOfPericenter 180
		MeanAnomaly     0
		//SemiAmplitude   52.8
	}
}

Star "TET1 Ori B5"
{
	ParentBody "TET1 Ori B145"
	Class      "G2III"
	MassSol    2
	RadSol     8.4
	Luminosity 80
	Teff       5740

  Orbit
	{
		PeriodDays      6.471
		Epoch           2440265.34
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   171
	}
}

Star "TET1 Ori B4"
{
	ParentBody "TET1 Ori B145"
	Class      ""
	MassSol    0.2

  Orbit
	{
		SemiMajorAxis   256.82 // Unstable???
	}
}

Star "TET1 Ori B2"
{
	ParentBody "TET1 Ori B2-B3"
	Class      ""
	MassSol    3

	BinaryOrbit
	{
		Separation      42.8123
	}
}

Star "TET1 Ori B3"
{
	ParentBody "TET1 Ori B2-B3"
	Class      ""
	MassSol    2.5

	/* BinaryOrbit
	{
		Separation      42.8123
	} */
}

// ----------C1 and C2---------- //
Star "TET1 Ori C1"
{
	ParentBody "TET1 Ori C"
	Class      "O6Vp"
	MassSol    33
  RadSol     10.6
	Luminosity 204000
  Teff       39000
	Age        0.011

	Orbit
	{
		Period          11.05
		Eccentricity    0.534
		Inclination     100.7
		AscendingNode   25.3
		ArgOfPericenter 110.9
		MeanAnomaly     0
	}
}

Star "TET1 Ori C2"
{
	ParentBody "TET1 Ori C"
	Class      ""
	MassSol    11

	Orbit
	{
		Period          11.05
		Eccentricity    0.534
		Inclination     100.7
		AscendingNode   25.3
		ArgOfPericenter 290.9
		MeanAnomaly     0
	}
}

// ----------D's components---------- //
// NOIRLab listed another companion which is a sun-like star(1 MSun), located at 1.4" distant.
// Is it physically bound to the system?
Star "TET1 Ori Da"
{
	ParentBody "TET1 Ori D"
	Class      "B1.5Vp"
	MassSol    18
  RadSol     5.6
	Luminosity 29500
  Teff       39000
	Age        0.0025

	Orbit
	{
		PeriodDays      40
		Epoch           2457790.54023945
		Eccentricity    0.43
		AscendingNode   346
		ArgOfPericenter 166
		Inclination     160
		MeanAnomaly     0
	}
}

Star "TET1 Ori Db"
{
	ParentBody "TET1 Ori D"
	Class      ""
	MassSol    6 // taken from NOIRLab

	Orbit
	{
		PeriodDays      40
		Epoch           2457790.54023945
		Eccentricity    0.43
		AscendingNode   346
		ArgOfPericenter 346
		Inclination     160
		MeanAnomaly     0
	}
}

// ----------E's components---------- //
Star "TET1 Ori Ea"
{
	ParentBody "TET1 Ori E"
	Class      "G2IV" // Protostar
	MassSol    2.807
  RadSol     7.1
	Luminosity 29
  Teff       6000

	Orbit
	{
		Period          9.8952
		Eccentricity    0.001
		Inclination     73.7
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   84.2
	}
}

Star "TET1 Ori Eb"
{
	ParentBody "TET1 Ori E"
	Class      "G2IV" // Protostar
	MassSol    2.797
  RadSol     7.1
	Luminosity 29
  Teff       6000
	Age        0.5

	Orbit
	{
		Period          9.8952
		Eccentricity    0.001
		Inclination     73.7
		ArgOfPericenter 180
		MeanAnomaly     0
		//SemiAmplitude   84.6
	}
}

// ----------G's components---------- //
Star "TET1 Ori Ga"
{
	ParentBody "TET1 Ori G"
	Class      "K0.7"

	BinaryOrbit
	{
		Separation      149.808
	}
}

Star "HH 726/TET1 Ori Gb"
{
	ParentBody "TET1 Ori G"
	Class      "K" // Protostar
	KerrSpin   0.0043079
	KerrCharge 0

	AccretionDisk
	{
		OuterRadiusKm   2.7719e+06
		InnerThicknessKm 3.0452e+05
		OuterThicknessKm 3.0452e+06
		ThicknessPow    3
		DetailScaleR    6
		DetailScaleV    1
		TwistMagn       2500
		JetRadiusKm     1.2838e+05
		JetLength       0.25746
		AccretionRate   1.3732e-25
		Temperature     1.5941e+07
		Density         1e+05
		Luminosity      0.5498
		Brightness      1
	}

	CometTail
	{
		MaxLength   0.25746
		GasToDust   0
		Particles   5000
		GasBright   0.091607
		DustBright  0.070899
		GasColor   (1.000 1.000 1.000)
		DustColor  (1.000 1.000 1.000)
	}

	/* BinaryOrbit
	{
		Separation      149.808
	} */
}

// ----------H's components---------- //
Star "Parenago 1867"
{
	ParentBody "TET1 Ori H"
	Class      "Ke" // Protostar

	BinaryOrbit
	{
		Separation      693.393
	}
}

Star "Parenago 1866"
{
	ParentBody "TET1 Ori H"
	Class      "K" // Protostar

	/* BinaryOrbit
	{
		Separation      693.393
	} */
}
