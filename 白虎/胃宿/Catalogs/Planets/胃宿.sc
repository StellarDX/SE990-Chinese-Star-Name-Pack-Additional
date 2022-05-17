// 胃宿增四(***)
Barycenter "52 Ari AB"
{
  ParentBody "52 Ari"
  BinaryOrbit
  {
    Separation      872.1
  }
}

Star "52 Ari A/HD 19134/HR 927"
{
	ParentBody "52 Ari AB"
	Class      "B7V"
	MassSol    5.12
  RadSol     3.3
  Luminosity 452
  Teff       12912

	Orbit
	{
		Period          227
		Eccentricity    0.73
    Inclination     77.5
    AscendingNode   92.8
    Epoch           2429082.13817307
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "52 Ari B/HD 19135/HR 928"
{
	ParentBody "52 Ari AB"
	Class      "B7V"
  MassSol    5.12

  Orbit
	{
		Period          227
		Eccentricity    0.73
    Inclination     77.5
    AscendingNode   92.8
    Epoch           2429082.13817307
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "52 Ari C"
{
	ParentBody     "52 Ari"
	Class          ""
	MassSol        1.2 // NOIRLab Data

  /*BinaryOrbit
  {
    Separation      872.1
  }*/
}

// 胃宿增五(PM**)
Star "HD 16628 A"
{
	ParentBody "HD 16628"
	Class      "A3V"

	BinaryOrbit
	{
    Separation      2030.6
	}
}

Star "HD 16628 B"
{
	ParentBody "HD 16628"
	Class      "A8.5 V"

  /*BinaryOrbit
	{
    Separation      2030.6
	}*/
}

// 大陵增四(EB**)
Star "HD 11241 A"
{
	ParentBody "HD 11241"
	Class      "B2"
  MassSol    6.95
  RadSol     3.29
  Luminosity 2188
  Teff       21500
  RotationPeriod 34.8

	Orbit
	{
    PeriodDays      25.935951
    Eccentricity    0.3768
    Inclination     88.048
    Epoch           2443563.466
    ArgOfPericenter 289.83
    MeanAnomaly     0
    //SemiAmplitude   97.4
	}
}

Star "HD 11241 B"
{
	ParentBody "HD 11241"
	Class      "B2"
  MassSol    7.42
  RadSol     3.86
  Luminosity 3311
  Teff       22000
  RotationPeriod 33.6

  Orbit
	{
    PeriodDays      25.935951
    Eccentricity    0.3768
    Inclination     88.048
    Epoch           2443563.466
    ArgOfPericenter 109.83
    MeanAnomaly     0
    //SemiAmplitude   91.2
	}
}

// 大陵增六(SB**)
Remove "6 Per A"{ParentBody "6 Per"}
Remove "6 Per B"{ParentBody "6 Per"}
Star "HD 13530 A"
{
	ParentBody "HD 13530"
	Class      "G8.5IIIbFe-2"
  MassSol    1.5
  RadSol     7
  Luminosity 26.3
  Teff       4920
  FeH        -0.6

	Orbit
	{
    PeriodDays      1576.23
    Eccentricity    0.8828
    Inclination     104
    Epoch           2450307.31
    ArgOfPericenter 86.4
    MeanAnomaly     0
    //SemiAmplitude   19.82
	}
}

Star "HD 13530 B"
{
	ParentBody "HD 13530"
	Class      "M0.2 V"

  Orbit
	{
    PeriodDays      1576.23
    Eccentricity    0.8828
    Inclination     104
    Epoch           2450307.31
    ArgOfPericenter 266.4
    MeanAnomaly     0
	}
}

// 大陵增十(SB**)
Star "HD 15138 A"
{
	ParentBody "HD 15138"
	Class      "F4V"
  MassSol    1.38
  RadSol     1.7
  Luminosity 4.9
  Teff       6627
  FeH        -0.14
  Age        1.273

	Orbit
	{
    PeriodDays      10.989861
    Eccentricity    0.19236
    Epoch           2454007.675
    ArgOfPericenter 70.55
    MeanAnomaly     0
    //SemiAmplitude   46.719
	}
}

Star "HD 15138 B"
{
	ParentBody "HD 15138"
	Class      ""
  RadSol     1.5
  Luminosity 3.8

  Orbit
	{
    PeriodDays      10.989861
    Eccentricity    0.19236
    Epoch           2454007.675
    ArgOfPericenter 250.55
    MeanAnomaly     0
    //SemiAmplitude   48.083
	}
}

// 大陵增十三(PM**)
Remove "TET Per A"{ParentBody "TET Per"}
Remove "TET Per B"{ParentBody "TET Per"}
Star "TET Per A/13 Per/HR 799/HD 16895/HIP 12777/FK5 93/GC 3277/PPM 45428/SAO 38288"
{
	ParentBody "CCDM J02441+4913"
	Class      "F8V"
  MassSol    1.138
  RadSol     1.319
  Luminosity 2.235
  Teff       6328
  FeH        -0.03
  Age        4

	Orbit
	{
    Period          2720
    Eccentricity    0.13
    Inclination     75.44
    AscendingNode   128
    Epoch           2310195.80246985
    ArgOfPericenter 280.64
    MeanAnomaly     0
	}
}

Star "TET Per B/2MASS J02441025+4913540"
{
	ParentBody "CCDM J02441+4913"
	Class      "M1.5V"
  MassSol    0.521
  RadSol     0.498
  Teff       3685
  FeH        -0.03
  Age        2.4

  Orbit
	{
    Period          2720
    Eccentricity    0.13
    Inclination     75.44
    AscendingNode   128
    Epoch           2310195.80246985
    ArgOfPericenter 100.64
    MeanAnomaly     0
	}
}

// 大陵增十五(***)
Barycenter "HD 17904 AB"
{
  ParentBody "HD 17904"
  BinaryOrbit
  {
    Separation      989.74
  }
}

Star "HD 17904 A"
{
	ParentBody "HD 17904 AB"
	Class      "F6V"
	MassSol    1.5

	Orbit
	{
		Period          31.633
		Eccentricity    0.756
    Inclination     120.48
    AscendingNode   26.62
    Epoch           2450255.5
		ArgOfPericenter 85.54
		MeanAnomaly     0
	}
}

Star "HD 17904 B"
{
	ParentBody "HD 17904 AB"
	Class      ""
  MassSol    1.5

  Orbit
	{
    Period          31.633
		Eccentricity    0.756
    Inclination     120.48
    AscendingNode   26.62
    Epoch           2450255.5
		ArgOfPericenter 265.54
		MeanAnomaly     0
	}
}

Star "HD 17904 C"
{
	ParentBody     "HD 17904"
	Class          ""
	MassSol        0.92 // NOIRLab Data

  /*BinaryOrbit
  {
    Separation      989.74
  }*/
}

// 大陵增二十(SB**)
Star "HD 20315 A"
{
	ParentBody "HD 20315"
	Class      "B7V"
  MassSol    4.24
  Luminosity 611
  Teff       9908

	Orbit
	{
    PeriodDays      36.5
    Eccentricity    0.3
    Epoch           24407531.7
    ArgOfPericenter 132
    MeanAnomaly     0
    //SemiAmplitude   20
	}
}

Star "HD 20315 B"
{
	ParentBody "HD 20315"
	Class      "B9.4 V"

  Orbit
	{
    PeriodDays      36.5
    Eccentricity    0.3
    Epoch           24407531.7
    ArgOfPericenter 312
    MeanAnomaly     0
	}
}

// 天船增三(**)
Star "HD 21428 A"
{
	ParentBody "HD 21428"
	Class      "B3V"
  MassSol    6.9
  RadSol     3.1
  Luminosity 671
  Teff       16421
  Age        0.0293

	BinaryOrbit
	{
    Separation      99.0005
	}
}

Star "HD 21428 B"
{
	ParentBody "HD 21428"
	Class      "A3.1 V"

  /*BinaryOrbit
	{
    Separation      99.0005
	}*/
}

// 天船增四(*Pl)
Remove "SIG Per b"{ParentBody "SIG Per"}
Planet	"SIG Per b"
{
	ParentBody     "GC 4158"
	DiscMethod     "RadVel"
	DiscDate       "2014"
  Mass           2065.88447

	Orbit
	{
		Epoch           2453022.6
		Period          1.587439831
		SemiMajorAxis   1.8
		Eccentricity    0.3
		ArgOfPericen    83.5
	}
}

// 天船增七(SB***)
Barycenter "HD 29317 A"
{
  ParentBody "HD 29317"
  BinaryOrbit
  {
    Separation      481
  }
}

Star "HD 29317 Aa"
{
	ParentBody "HD 29317 A"
	Class      "K0III"
	MassSol    3.3
  RadSol     24.1
  Luminosity 259
  Teff       4715
  FeH        -0.21
  RotationPeriod 2904

	Orbit
	{
		PeriodDays      121
		Eccentricity    0.02
		ArgOfPericenter 0
		MeanAnomaly     0
    //SemiAmplitude   28.2
	}
}

Star "HD 29317 Ab"
{
	ParentBody "HD 29317 A"
	Class      ""
  MassSol    2.37

  Orbit
	{
    PeriodDays      121
		Eccentricity    0.02
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HD 29317 B"
{
	ParentBody     "HD 29317"
	Class          ""
	MassSol        0.65

  /*BinaryOrbit
  {
    Separation      481
  }*/
}

// 天船增八(***)
Barycenter "HD 29316 A"
{
  ParentBody "HD 29316"
  BinaryOrbit
  {
    Period          660
    Eccentricity    0.405
    Inclination     132.5
    AscendingNode   286.2
    Epoch           2455817.86712384
    ArgOfPericenter 285.1
    MeanAnomaly     0
  }
}

Star "HD 29316 Aa"
{
	ParentBody "HD 29316 A"
	Class      "A8V"
	MassSol    1.94

	Orbit
	{
    Period          26.34
    Eccentricity    0.846
    Inclination     113.3
    AscendingNode   12.6
    Epoch           2447519.56436753
    ArgOfPericenter 222.9
    MeanAnomaly     0
	}
}

Star "HD 29316 Ab"
{
	ParentBody "HD 29316 A"
	Class      ""
  MassSol    1.45

  Orbit
	{
    Period          26.34
    Eccentricity    0.846
    Inclination     113.3
    AscendingNode   12.6
    Epoch           2447519.56436753
    ArgOfPericenter 42.9
    MeanAnomaly     0
	}
}

Star "HD 29316 B"
{
	ParentBody     "HD 29316"
	Class          ""
	MassSol        1.5

  /*BinaryOrbit
  {
    Period          660
    Eccentricity    0.405
    Inclination     132.5
    AscendingNode   286.2
    Epoch           2455817.86712384
    ArgOfPericenter 105.1
    MeanAnomaly     0
  }*/
}

// 天船增十(SB***)
// NOIRLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=20070
Barycenter "HD 26961 A"
{
  ParentBody "HD 26961"
  BinaryOrbit
  {
    PeriodDays      701.76
    Eccentricity    0.235
    Inclination     83.46
    AscendingNode   115.29
    Epoch           2440143.3984
    ArgOfPericenter 83
    MeanAnomaly     0
  }
}

Star "HD 26961 Aa"
{
	ParentBody "HD 26961 A"
	Class      "A1III"
	MassSol    2.25
  RadSol     3.2
  Teff       9000

	Orbit // SB9_226 1976ApJ...208..152H
	{
    PeriodDays      1.5274
    Eccentricity    0.02
    Epoch           2440002.078
    ArgOfPericenter 291
    MeanAnomaly     0
	}
}

Star "HD 26961 Ab"
{
	ParentBody "HD 26961 A"
	Class      ""
  MassSol    0.56

  Orbit
	{
    PeriodDays      1.5274
    Eccentricity    0.02
    Epoch           2440002.078
    ArgOfPericenter 111
    MeanAnomaly     0
	}
}

Star "HD 26961 B"
{
	ParentBody     "HD 26961"
	Class          "F"
	MassSol        1.24

  /*BinaryOrbit
  {
    PeriodDays      701.76
    Eccentricity    0.235
    Inclination     83.46
    AscendingNode   115.29
    Epoch           2440143.3984
    ArgOfPericenter 263
    MeanAnomaly     0
  }*/
}

// 积水增一(SB**)
Star "HD 24546 A"
{
	ParentBody "HD 24546"
	Class      "F5V"
  MassSol    1.54
  RadSol     2.4
  Luminosity 10.81
  Teff       6609
  FeH        0

	Orbit
	{
    PeriodDays      30.438
    Eccentricity    0.631
    Epoch           2440873.14
    ArgOfPericenter 207.07
    MeanAnomaly     0
    //SemiAmplitude   51.85
	}
}

Star "HD 24546 B"
{
	ParentBody "HD 24546"
	Class      "G5.6 V"

  Orbit
	{
    PeriodDays      30.438
    Eccentricity    0.631
    Epoch           2440873.14
    ArgOfPericenter 27.07
    MeanAnomaly     0
    //SemiAmplitude   54.4
	}
}

// 天廪增二(SB**)
Star	"HD 23466 A"
{
	ParentBody     "HD 23466"
	Class          "B3V"

  Orbit
	{
		RefPlane        "Equator"
		Period          2.31221777
		Eccentricity    0.62693876
		Inclination     2.09576905
		AscendingNode   0
		ArgOfPericenter 75.3122838
		MeanAnomaly     25.793623
	}
}

Star	"HD 23466 B"
{
	ParentBody     "HD 23466"
	Class          "B6.9 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          2.31221777
		Eccentricity    0.62693876
		Inclination     2.09576905
		AscendingNode   0
		ArgOfPericenter -104.687716
		MeanAnomaly     25.793623
	}
}

// 天囷增三(SB***)
// NOIRLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=9631%20
Barycenter "HD 12641 A"
{
  ParentBody "HD 12641"
  BinaryOrbit
  {
    Separation      5383.75
    Period          189573
  }
}

Star "HD 12641 Aa"
{
	ParentBody "HD 12641 A"
	Class      "G5IIIb"
	MassSol    2

	Orbit // SB9_1895 1995Obs...115...84G, Tok 2019 combined
	{
    PeriodDays      2066.1001
    Epoch           2447328.5
    Eccentricity    0.366
    AscendingNode   272.1
    ArgOfPericenter 211
    Inclination     72.3 // Griffin: Aab resolvable by speckle, probably eclipsing, i~90 deg.
    MeanAnomaly     0
	}
}

Star "HD 12641 Ab"
{
	ParentBody "HD 12641 A"
	Class      "F5IV"
  MassSol    1.56

  Orbit
	{
    PeriodDays      2066.1001
    Epoch           2447328.5
    Eccentricity    0.366
    AscendingNode   272.1
    ArgOfPericenter 31
    Inclination     72.3
    MeanAnomaly     0
	}
}

Star "HD 12641 B"
{
	ParentBody     "HD 12641"
	Class          ""
	MassSol        0.94

  /*BinaryOrbit
  {
    Separation      5383.75
    Period          189573
  }*/
}

// 天囷增七(SB**)
Star	"HD 14951 A"
{
	ParentBody     "HD 14951"
	Class          "B7IV"
  MassSol        3.9
  Teff           13627
  Age            0.195

	Orbit
	{
		RefPlane        "Equator"
		Period          781.73583
		Eccentricity    0.0138479415
		Inclination     1.21046495
		AscendingNode   0
		ArgOfPericenter -169.516988
		MeanAnomaly     -119.104186
	}
}

Star	"HD 14951 B"
{
	ParentBody     "HD 14951"
	Class          "B9.3 IV"

	Orbit
	{
		RefPlane        "Equator"
		Period          781.73583
		Eccentricity    0.0138479415
		Inclination     1.21046495
		AscendingNode   0
		ArgOfPericenter 10.4830116
		MeanAnomaly     -119.104186
	}
}

// 天囷增八(**)
Star	"HD 16234 A"
{
	ParentBody     "HD 16234"
	Class          "F7V"
  Teff           6137
  FeH            -0.25
  Age            2.8

	Orbit
	{
		Period          3.8
		Eccentricity    0.017
		Inclination     112.7
		AscendingNode   145
    Epoch           2455299.22320157
		ArgOfPericenter 183.7
		MeanAnomaly     0
	}
}

Star	"HD 16234 B"
{
	ParentBody     "HD 16234"
	Class          "F7V"

	Orbit
	{
    Period          3.8
		Eccentricity    0.017
		Inclination     112.7
		AscendingNode   145
    Epoch           2455299.22320157
		ArgOfPericenter 3.7
		MeanAnomaly     0
	}
}

// 天囷增十六(***)
// NOIRLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=15383
Barycenter "HD 20559 AB"
{
  ParentBody "HD 20559"
  BinaryOrbit // LDS_3472 AC Gaia pos
  {
    Separation      3306.84
    Period          97604
  }
}

Star "HD 20559 A"
{
	ParentBody "HD 20559 AB"
	Class      "G9IV"
	MassSol    1.02
  RadSol     7.94
  Luminosity 32.34
  Teff       4677.35
  FeH        -0.09

	Orbit // VB6_Pop1997f AC_2AB Gr.4
	{
    Period          282.42
    Epoch           2502031.9625356
    Eccentricity    0.27
    AscendingNode   72.8
    ArgOfPericenter 0
    Inclination     64.8
    MeanAnomaly     0
	}
}

Star "HD 20559 B"
{
	ParentBody "HD 20559 AB"
	Class      ""
  MassSol    1.23

  Orbit
	{
    Period          282.42
    Epoch           2502031.9625356
    Eccentricity    0.27
    AscendingNode   72.8
    ArgOfPericenter 180
    Inclination     64.8
    MeanAnomaly     0
	}
}

Star "HD 20559 C"
{
	ParentBody     "HD 20559"
	Class          "DA"
	MassSol        0.5

  /*BinaryOrbit
  {
    Separation      3306.84
    Period          97604
  }*/
}

// 天囷增十七(PM***)
Remove "94 Cet A"{ParentBody "94 Cet"}
Remove "94 Cet B"{ParentBody "94 Cet"}
Star "HD 19994 A"
{
	ParentBody "HD 19994"
	Class      "F8V"
	MassSol    1.3
  RadSol     1.898
  Luminosity 4.2
  Teff       6055
  FeH        1.15
  RotationPeriod 292.8
  Age        4.8

	/*BinaryOrbit
	{
    Period          2029
    Eccentricity    0.26
    Inclination     104
    AscendingNode   97
    ArgOfPericenter 162
    MeanAnomaly     0
	}*/
}

Barycenter "HD 19994 BC"
{
  ParentBody "HD 19994"
  BinaryOrbit
  {
    Period          2029
    Eccentricity    0.26
    Inclination     104
    AscendingNode   97
    ArgOfPericenter 342
    MeanAnomaly     0
  }
}

Star "HD 19994 B"
{
	ParentBody "HD 19994 BC"
	Class      "M3V"

  Orbit
	{
    PeriodDays      378.35
    Eccentricity    0.36
    Inclination     108.323
    AscendingNode   191.496
    Epoch           2455114.404
    ArgOfPericenter 154.895
    MeanAnomaly     0
	}
}

Star "HD 19994 C"
{
	ParentBody     "HD 19994 BC"
	Class          "M"

  Orbit
  {
    PeriodDays      378.35
    Eccentricity    0.36
    Inclination     108.323
    AscendingNode   191.496
    Epoch           2455114.404
    ArgOfPericenter 334.895
    MeanAnomaly     0
  }
}

//////////ExoPlanets//////////
Remove "HD 19994 b"{ParentBody "HD 19994"}
Planet	"94 Cet b"
{
	ParentBody     "HD 19994 A"
	DiscMethod     "Astrometry" // Doppler Spectroscopy
	DiscDate       "2000" // Mayor et al., 2000.08.07
  Mass           589.5716449

	Orbit
	{
		SemiMajorAxis   1.427
		Eccentricity    0.3
    PeriodDays      535.7
    Inclination     65 // 115
    Epoch           2450944
    ArgOfPericenter 41
    MeanAnomaly     0
	}
}

// 天囷增二十(**)
Star	"HD 16765 A"
{
	ParentBody     "HD 16765"
	Class          "F7V"
  MassSol        1.168
  RadSol         1.208
  Luminosity     2.133
  Teff           6356
  FeH            -0.15
  Age            2.1

	BinaryOrbit
	{
    Separation      74.5
	}
}

Star	"HD 16765 B"
{
	ParentBody     "HD 16765"
	Class          "K2V"

  /*BinaryOrbit
	{
    Separation      74.5
	}*/
}

// 天囷增廿一(RS****)
// NOIRLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=16846%20
Barycenter "HD 22468 A"
{
  ParentBody "HD 22468" // Allen et al. confirm AB as physical. Dyn.plx(AB)=34mas. DR2-HIP: acceler.
  BinaryOrbit // VB6_Hop1964b STF_422 Gr.5
  {
    Period          2101
    Epoch           2415020.31352
    Eccentricity    0.18
    AscendingNode   92.3
    ArgOfPericenter 152
    Inclination     32.1
    MeanAnomaly     0
  }
}

Barycenter "HD 22468 B"
{
  ParentBody "HD 22468"
  /*BinaryOrbit
  {
    Period          2101
    Epoch           2415020.31352
    Eccentricity    0.18
    AscendingNode   92.3
    ArgOfPericenter 332
    Inclination     32.1
    MeanAnomaly     0
  }*/
}

Star "HD 22468 Aa"
{
	ParentBody "HD 22468 A"
	Class      "K2:Vnk"
	MassSol    1.2

	Orbit // SB9_181 2000A&A...354..537S
	{
    PeriodDays      2.8377
    Epoch           2442767.898
    ArgOfPericenter 0
    MeanAnomaly     0
	}
}

Star "HD 22468 Ab"
{
	ParentBody "HD 22468 A"
	Class      "K1IV"
  MassSol    0.98
  Oblateness 0

  Orbit
	{
    PeriodDays      2.8377
    Epoch           2442767.898
    ArgOfPericenter 180
    MeanAnomaly     0
	}
}

Star "HD 22468 Ba"
{
	ParentBody "HD 22468 B"
	Class      "K6V"
	MassSol    0.79

	Orbit // SB9_1523 2001A&A...374..227T
	{
    PeriodDays      1152
    Epoch           2450362.5
    Eccentricity    0.4
    ArgOfPericenter 268
    MeanAnomaly     0
	}
}

Star "HD 22468 Bb"
{
	ParentBody "HD 22468 B"
	Class      ""
  MassSol    0.07

  Orbit
	{
    PeriodDays      1152
    Epoch           2450362.5
    Eccentricity    0.4
    ArgOfPericenter 88
    MeanAnomaly     0
	}
}
