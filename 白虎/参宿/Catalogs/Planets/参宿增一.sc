// Stars of Sigma Orionis Octuple System
// Wikipedia: https://en.wikipedia.org/wiki/Sigma_Orionis
// NOIRLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=26549

Remove "SIG Ori (AB)"{ParentBody "SIG Ori"}
Remove "SIG Ori B"{ParentBody "SIG Ori"}
Remove "SIG Ori Aa"{ParentBody "SIG Ori (AB)"}
Remove "SIG Ori Ab"{ParentBody "SIG Ori (AB)"}
Remove "SIG Ori C"{ParentBody "SIG Ori"}
Remove "SIG Ori Ca"{ParentBody "SIG Ori C"}
Remove "SIG Ori Cb"{ParentBody "SIG Ori C"}
Remove "SIG Ori D"{ParentBody "SIG Ori"}
Remove "SIG Ori E"{ParentBody "SIG Ori"}
Remove "SIG Ori Ea"{ParentBody "SIG Ori E"}
Remove "SIG Ori Eb"{ParentBody "SIG Ori E"}

// only sig ori A and B Orbits are stable/C,D,E are not

// Main barycenter
Barycenter "SIG Ori A-B/HD 37468/HR 1931/HIP 26549/SAO 132406/BD-02 1326/2MASS J05384476-0236001/Mayrit AB"
{
	ParentBody "Sigma Orionis Octuple System"
	Orbit
	{
    RefPlane        "Static"
	}
}

// ----------AB triple system---------- //
Barycenter "SIG Ori A"
{
	ParentBody "SIG Ori A-B"
	Orbit
	{
		Epoch           2451361.912299
		Period          159.896
		Eccentricity    0.024
		Inclination     172.1
		AscendingNode   121.7
		ArgOfPericenter 8.7
		MeanAnomaly     0
	}
}

Star "SIG Ori Aa"
{
	ParentBody "SIG Ori A"
	Class      "O9.5V"
	MassSol    18
	RadSol     5.6
  Luminosity 41700
	Teff       35000
	Age        0.0003

	Orbit
	{
		PeriodDays      143.2002
		Eccentricity    0.77896
		Inclination     56.378
		ArgOfPericenter 0
		MeanAnomaly     0
    //SemiAmplitude   72.03
	}
}

Star "SIG Ori Ab"
{
	ParentBody "SIG Ori A"
	Class      ""
	MassSol    13
	RadSol     4.8
  Luminosity 18600
	Teff       31000
	Age        0.0009

	Orbit
	{
		PeriodDays      143.2002
		Eccentricity    0.77896
		Inclination     56.378
		ArgOfPericenter 180
		MeanAnomaly     0
    //SemiAmplitude   95.53
	}
}

Star "SIG Ori B"
{
	ParentBody "SIG Ori A-B"
	Class      "B0.5V"
	MassSol    14
	RadSol     5
  Luminosity 15800
	Teff       29000
	Age        0.0019

	Orbit
	{
		Epoch           2451361.912299
		Period          159.896
		Eccentricity    0.024
		Inclination     172.1
		AscendingNode   121.7
		ArgOfPericenter 188.7
		MeanAnomaly     0
	}
}

// ----------C's components---------- //

Barycenter "SIG Ori C/2MASS J05384411-0236062/Mayrit 11238"
{
	ParentBody "Sigma Orionis Octuple System"
	Orbit // Random
	{
    SemiMajorAxis   3960
		Eccentricity    0.229007634
		Inclination     22.8907132
		AscendingNode   -255.572519
		ArgOfPericenter 63.2061069
		MeanAnomaly     -41.221374
	}
}

Star "SIG Ori Ca"
{
	ParentBody "2MASS J05384411-0236062"
	Class      "A2 V"
	AppMagn    8.79
	MassSol    2.7

	BinaryOrbit // Random
	{
		Separation      700		// sepration 2" = 700 AU
    Eccentricity    0.610853493
		Inclination     -1.47145796
		AscendingNode   0
		ArgOfPericenter 257.538149
		MeanAnomaly     -139.455573
	}
}

Star "SIG Ori Cb/[BHM2009] SigOri-MAD-4"
{
	ParentBody "2MASS J05384411-0236062"
	Class      "L"	// unknown

	/* Orbit
	{
		SemiMajorAxis   687		// sepration 2" = 700 AU
    Eccentricity    0.610853493
		Inclination     -1.47145796
		AscendingNode   0
		ArgOfPericenter 77.538149
		MeanAnomaly     -139.455573
	} */
}

// ----------D (Single star)---------- //

Star "SIG Ori D/HIP 26551/2MASS J05384561-0235588/Mayrit 13084"
{
	ParentBody "Sigma Orionis Octuple System"
	Class      "B2V"
	MassSol    6.8
	Teff       21500

	Orbit // Random
	{
		SemiMajorAxis   4680
    Eccentricity    0.47987304
		Inclination     -53.8950774
		AscendingNode   85.1908397
		ArgOfPericenter 228.091603
		MeanAnomaly     79.6946565
	}
}

// ----------E's components---------- //

Barycenter "SIG Ori E/V1030 Ori/HR 1932/HD 37479/BD-02 1327/2MASS J05384719-0235405/Mayrit 41062"
{
	ParentBody "Sigma Orionis Octuple System"
	Orbit // Random
	{
		SemiMajorAxis   15000
    Eccentricity    0.625954198
		Inclination     129.219642
		AscendingNode   244.580153
		ArgOfPericenter -13.740458
		MeanAnomaly     -141.123692
	}
}

Star "SIG Ori Ea"
{
	ParentBody "V1030 Ori"
	Class      "B2 V"
	MassSol    8.3
	RadSol     3.77
  Luminosity 3162
	Teff       22500
	RotationPeriod 28.580328
  Age        0.0004

	BinaryOrbit
	{
		Separation      100	// sepration 0.3" = 100 AU
    Eccentricity    0.623109639
		Inclination     1.90567678
		AscendingNode   0
		ArgOfPericenter 69.115637
		MeanAnomaly     -120.89558
	}
}

Star "SIG Ori Eb"
{
	ParentBody "V1030 Ori"
	Class      ""
	MassSol    0.4 // 0.8

	/* Orbit
	{
    Separation      100	// sepration 0.3" = 100 AU
    Eccentricity    0.623109639
		Inclination     1.90567678
		AscendingNode   0
		ArgOfPericenter 249.115637
		MeanAnomaly     -120.89558
	} */
}
