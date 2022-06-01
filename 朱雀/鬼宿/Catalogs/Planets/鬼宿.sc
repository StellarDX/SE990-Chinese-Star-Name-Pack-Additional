// 鬼宿增二(PM**)
Star	"HD 70569 A"
{
	ParentBody     "HD 70569"
	Class          "A9V"
  MassSol        2.41
  Luminosity     59.9
  Teff           7097

	Orbit
	{
		RefPlane        "Equator"
		Period          4.75961876
		Eccentricity    0.382701427
		Inclination     1.72278619
		AscendingNode   0
		ArgOfPericenter -97.4539719
		MeanAnomaly     60.8553056
	}
}

Star	"HD 70569 B"
{
	ParentBody     "HD 70569"
	Class          "F0 IV"

	Orbit
	{
		RefPlane        "Equator"
		Period          4.75961876
		Eccentricity    0.382701427
		Inclination     1.72278619
		AscendingNode   0
		ArgOfPericenter 82.5460281
		MeanAnomaly     60.8553056
	}
}

// 鬼宿增三(PM**)
Star	"HD 71030 A"
{
	ParentBody     "HD 71030"
	Class          "F6V"
  MassSol        1.51
  Luminosity     6.6
  Teff           6487
  FeH            -0.1
  Age            2.5

	BinaryOrbit
	{
    Epoch           2456292.68198225
    Period          4.05E+6
    Separation      1797.39
    PositionAngle   310
	}
}

Star	"HD 71030 B"
{
	ParentBody     "HD 71030"
	Class          ""
  MassSol        0.34

  /* BinaryOrbit
	{
    Epoch           2456292.68198225
    Period          4.05E+6
    Separation      1797.39
    PositionAngle   310
	} */
}

// 鬼宿增六(**)
Star	"HD 74228 A"
{
	ParentBody     "HD 74228"
	Class          "G8III"
  MassSol        3.11
  RadSol         13.86
  Luminosity     210.3
  Teff           5058
  FeH            -0.69

	Orbit
	{
		PeriodDays      1009.36
		Eccentricity    0.461
		ArgOfPericenter 0
		MeanAnomaly     0
    //SemiAmplitude   20.04
	}
}

Star	"HD 74228 B"
{
	ParentBody     "HD 74228"
	Class          "A3III"
  MassSol        3
  Luminosity     190.5

  Orbit
	{
		PeriodDays      1009.36
		Eccentricity    0.461
		ArgOfPericenter 180
		MeanAnomaly     0
    //SemiAmplitude   20.75
	}
}

// 鬼宿增八(PM**)
Star	"HD 75528 A"
{
	ParentBody     "HD 75528"
	Class          "G5V"
  MassSol        1.23
  RadSol         1.81
  Luminosity     3.72
  Teff           5862
  Age            5

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00312508384
		SemiMajorAxis   0.00744653059
		Eccentricity    0
		Inclination     0.4865942
		AscendingNode   0
		ArgOfPericenter 144.825754
		MeanAnomaly     -79.4226222
	}
}

Star	"HD 75528 B"
{
	ParentBody     "HD 75528"
	Class          "G1.5 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00312508384
		Eccentricity    0
		Inclination     0.4865942
		AscendingNode   0
		ArgOfPericenter 324.825754
		MeanAnomaly     -79.4226222
	}
}

// 鬼宿增十五(PM**)
Star	"HD 80218 A"
{
	ParentBody     "HD 80218"
	Class          "F4V"
  MassSol        1.13
  RadSol         1.53
  Luminosity     3.135
  Teff           6218
  FeH            -0.26
	Age            3.1

	Orbit
	{
		PeriodDays      32
		Eccentricity    0.6
		Inclination     94
		AscendingNode   148
		Epoch           2442778.72062736
		ArgOfPericenter 351
		MeanAnomaly     0
	}
}

Star	"HD 80218 B"
{
	ParentBody     "HD 80218"
	Class          "WD"
  MassSol        1.3

  Orbit
	{
		PeriodDays      32
		Eccentricity    0.6
		Inclination     94
		AscendingNode   148
		Epoch           2442778.72062736
		ArgOfPericenter 171
		MeanAnomaly     0
	}
}

// 积尸增二(**)
Star	"HD 73785 A"
{
	ParentBody     "HD 73785"
	Class          "A7III"
	MassSol        2.39
	RadSol         4.22
	Luminosity     51.5
	Teff           7607
	FeH            -0.08
	Age            0.603

	Orbit
	{
		RefPlane        "Equator"
		Period          0.218176917
		Eccentricity    0.640559614
		Inclination     -0.0359818935
		AscendingNode   0
		ArgOfPericenter -179.625174
		MeanAnomaly     -135.314222
	}
}

Star	"HD 73785 B"
{
	ParentBody     "HD 73785"
	Class          "A6.1 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.218176917
		Eccentricity    0.640559614
		Inclination     -0.0359818935
		AscendingNode   0
		ArgOfPericenter 0.374826137
		MeanAnomaly     -135.314222
	}
}

// 积尸增三(SB****)
Barycenter	"积尸增三(G)/Meleph A/EPS Cnc/41 Cnc/BD+20 2171/GC 11904/HD 73731/HIP 42556/HR 3429/SAO 98024/GSC 01395-02733"
{
	ParentBody     "CCDM J08404+1932"
	BinaryOrbit
	{
		Separation      25093.5
	}
}

Barycenter	"Meleph B/BD+20 2163/GC 11893/HD 73711/SAO 98018"
{
	ParentBody     "CCDM J08404+1932"
	/* BinaryOrbit
	{
		Separation      25093.5
	} */
}

Star	"EPS Cnc A"
{
	ParentBody     "EPS Cnc"
	Class          "A5III"
  MassSol        2.5
  RadSol         4.8
  Luminosity     90
  Teff           8163
  FeH            0.1
	Age            0.728

	Orbit
	{
		PeriodDays      35.202
		Eccentricity    0.32
		Epoch           2448313.5
		ArgOfPericenter 85
		MeanAnomaly     0
		//SemiAmplitude   53
	}
}

Star	"EPS Cnc B"
{
	ParentBody     "EPS Cnc"
	Class          "Am" // ?

	Orbit
	{
		PeriodDays      35.202
		Eccentricity    0.32
		Epoch           2448313.5
		ArgOfPericenter 265
		MeanAnomaly     0
		//SemiAmplitude   53
	}
}

Star	"HD 73711 A"
{
	ParentBody     "HD 73711"
	Class          "F0III"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.313739563
		Eccentricity    0.757282734
		Inclination     2.13179713
		AscendingNode   0
		ArgOfPericenter 38.5757399
		MeanAnomaly     177.071028
	}
}

Star	"HD 73711 B"
{
	ParentBody     "HD 73711"
	Class          "F7.5 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.313739563
		Eccentricity    0.757282734
		Inclination     2.13179713
		AscendingNode   0
		ArgOfPericenter 218.57574
		MeanAnomaly     177.071028
	}
}

// 爟增三(SB**)
Remove "CHI Gem A"{ParentBody "CHI Gem"}
Remove "CHI Gem B"{ParentBody "CHI Gem"}
Star	"HD 66216 A"
{
	ParentBody     "HD 66216"
	Class          "K2III"
  MassSol        1.83
  RadSol         14
  Luminosity     79
  Teff           4560
  FeH            0.03
	Age            1.92

	Orbit
	{
		PeriodDays      2437.8
		Eccentricity    0.06
		Epoch           2442894.5
		ArgOfPericenter 84
		MeanAnomaly     0
		//SemiAmplitude   5.2
	}
}

Star	"HD 66216 B"
{
	ParentBody     "HD 66216"
	Class          "WD"

	Orbit
	{
		PeriodDays      2437.8
		Eccentricity    0.06
		Epoch           2442894.5
		ArgOfPericenter 264
		MeanAnomaly     0
	}
}

// 爟增六(PM**)
Star	"HD 69897 A"
{
	ParentBody     "HD 69897"
	Class          "F6V"
	MassSol        1.07
	RadSol         1.387
	Luminosity     2.4378
	Teff           6130
	FeH            -0.26
	Age            5.8

	Orbit
	{
		RefPlane        "Equator"
		Period          121.252735
		Eccentricity    0.333009124
		Inclination     -0.764809132
		AscendingNode   0
		ArgOfPericenter -83.2292534
		MeanAnomaly     66.0596097
	}
}

Star	"HD 69897 B"
{
	ParentBody     "HD 69897"
	Class          "G5.1 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          121.252735
		Eccentricity    0.333009124
		Inclination     -0.764809132
		AscendingNode   0
		ArgOfPericenter 96.7707466
		MeanAnomaly     66.0596097
	}
}

// 爟增八(**)
Star	"PHI2 Cnc A/HD 71151/HR 3311/SAO 80188"
{
	ParentBody     "HIP 41404"
	Class          "A6V"
	Luminosity     9.1
	FeH            -0.04

	BinaryOrbit
	{
		Separation      435.71
	}
}

Star	"PHI2 Cnc B/HD 71150/HR 3310/SAO 80187"
{
	ParentBody     "HIP 41404"
	Class          "A3V"

	/* BinaryOrbit
	{
		Separation      435.71
	} */
}

// 爟增九(PM***)
Remove "24 Cnc A"{ParentBody "24 Cnc"}
Remove "24 Cnc BC"{ParentBody "24 Cnc"}
Star	"24 Cnc A/BD+25 1920/HD 71152/HIP 41389/HR 3312/SAO 80184"
{
	ParentBody     "CCDM J08267+2432AB"
	Class          "F0III"
	MassSol        1.49

	/* BinaryOrbit
	{
		Separation      453.6
	} */
}

Barycenter	"24 Cnc B/HD 71153/HR 3313/SAO 80185"
{
	ParentBody     "CCDM J08267+2432AB"
	BinaryOrbit
	{
		Separation      453.6
	}
}

Star	"HD 71153 A"
{
	ParentBody     "HD 71153"
	Class          "F7V"
	MassSol        1.09

	Orbit
	{
		Period          21.78
		Eccentricity    0.079
		Inclination     19.1
		AscendingNode   153.6
		Epoch           2450967.45072403
		ArgOfPericenter 231
		MeanAnomaly     0
	}
}

Star	"HD 71153 B"
{
	ParentBody     "HD 71153"
	Class          ""
	MassSol        1.09

	Orbit
	{
		Period          21.78
		Eccentricity    0.079
		Inclination     19.1
		AscendingNode   153.6
		Epoch           2450967.45072403
		ArgOfPericenter 51
		MeanAnomaly     0
	}
}

// 爟增十(dS**)
Star	"HD 71496 A"
{
	ParentBody     "HD 71496"
	Class          "F0Vn"
	MassSol        2.36
	Luminosity     65.3
	Teff           7516

	Orbit
	{
		RefPlane        "Equator"
		Period          2262.98532
		Eccentricity    0.586096466
		Inclination     1.86785674
		AscendingNode   0
		ArgOfPericenter 10.1533963
		MeanAnomaly     -108.67494
	}
}

Star	"HD 71496 B"
{
	ParentBody     "HD 71496"
	Class          "F0.2 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          2262.98532
		Eccentricity    0.586096466
		Inclination     1.86785674
		AscendingNode   0
		ArgOfPericenter 190.153396
		MeanAnomaly     -108.67494
	}
}

// 外厨增二(SB*****)
// NOIRLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=41211%20
Barycenter	"1 Hya A"
{
	ParentBody     "1 Hya"
	Orbit
	{
		RefPlane        "Static"
	}
}

// WDS: CHR 172 Aa,Ab at 0.2", N=1. Conf. RBR: 2004.14 71.2d, 0.14", 2.9
Barycenter	"1 Hya Aa"
{
	ParentBody     "1 Hya A"
	Orbit
	{
		Period          5.012
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"1 Hya Aa1"
{
	ParentBody     "1 Hya Aa"
	Class          "F6V"
	MassSol        1.31

	Orbit // SB9_512 1922ApJ....55...30S
	{
		PeriodDays      1.563
		Epoch           2422650.082
		Eccentricity    0.05
		ArgOfPericenter 303.9
		MeanAnomaly     0
	}
}

Star	"1 Hya Aa2"
{
	ParentBody     "1 Hya Aa"
	Class          ""
	MassSol        0.22

	Orbit
	{
		PeriodDays      1.563
		Epoch           2422650.082
		Eccentricity    0.05
		ArgOfPericenter 123.9
		MeanAnomaly     0
	}
}

Star	"1 Hya Ab"
{
	ParentBody     "1 Hya A"
	Class          ""
	MassSol        0.79

	Orbit
	{
		Period          5.012
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// Allen 2012 AJ.144.62: PM(B)=(-211,-14), M4.5, physical. AB missed in Lepine2012.
Star	"1 Hya B"
{
	ParentBody     "1 Hya"
	Class          "M4.5"
	MassSol        0.14

	Orbit
	{
		SemiMajorAxis   949.256
		ArgOfPericenter 330
		MeanAnomaly     0
	}
}

// C is listed by Reid el al., 2003. Also in Lepine2012. PM(C)=(-190,-16)
Star	"1 Hya C"
{
	ParentBody     "1 Hya"
	Class          "M5.5Ve"
	MassSol        0.12

	Orbit
	{
		SemiMajorAxis   9542.14
		ArgOfPericenter 45
		MeanAnomaly     0
	}
}

// 外厨增六(SB***)
// NOIRLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=75737
Barycenter	"HD 75737 A"
{
	ParentBody     "HD 75737"
	BinaryOrbit
	{
		Separation      174
	}
}

Star	"HD 75737 Aa"
{
	ParentBody     "HD 75737 A"
	Class          "A2V"
	MassSol        2.35

	Orbit // SB9_538 1985ApJS...59..229A
	{
		PeriodDays      2.8952
		Epoch           2440000.648
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star	"HD 75737 Ab"
{
	ParentBody     "HD 75737 A"
	Class          ""
	MassSol        1.86

	Orbit
	{
		PeriodDays      2.8952
		Epoch           2440000.648
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HD 75737 B"
{
	ParentBody     "HD 75737"
	Class          ""
	MassSol        1.8

	/* BinaryOrbit
	{
		Separation      174
	} */
}

// 外厨增七(***)
// NOIRLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=43822%20
Barycenter	"17 Hya A/SAO 136409/HD 76370/HR 3553"
{
	ParentBody     "17 Hya"
	BinaryOrbit
	{
		Separation      398.435
	}
}

Star	"17 Hya Aa"
{
	ParentBody     "17 Hya A"
	Class          "A4hF1mF2"
	MassSol        1.91

	Orbit // Obs. 115 193 1995 Griffin
	{
		PeriodDays      18.8302
		Epoch           2449101.9
		Eccentricity    0.493
		ArgOfPericenter 12.5
		MeanAnomaly     0
	}
}

Star	"17 Hya Ab"
{
	ParentBody     "17 Hya A"
	Class          "M3V?"
	MassSol        0.24

	Orbit
	{
		PeriodDays      18.8302
		Epoch           2449101.9
		Eccentricity    0.493
		ArgOfPericenter 192.5
		MeanAnomaly     0
	}
}

// UMa group. B is also binary? (discordant RV, too bright)
Star	"17 Hya B/SAO 136408/HD 76369/HR 3552"
{
	ParentBody     "17 Hya"
	Class          "A1hF2mF3"
	MassSol        1.94

	/* BinaryOrbit
	{
		Separation      398.435
	} */
}

// 外厨增九(***)
Remove "12 Hya A"{ParentBody "12 Hya"}
Remove "12 Hya B"{ParentBody "12 Hya"}
Barycenter	"HD 74918 A"
{
	ParentBody     "HD 74918"
	BinaryOrbit
	{
		Epoch           2457388.4085786
		Separation      1661.6
		PositionAngle   266
	}
}

Star	"HD 74918 Aa"
{
	ParentBody     "HD 74918 A"
	Class          "G8IIIbCN-1"
	MassSol        2.32
	RadSol         11.51
	Luminosity     77.468
	Teff           4968
	Age            0.91

	Orbit
	{
		PeriodDays      1592
		Eccentricity    0.4
		Inclination     58
		AscendingNode   91
		Epoch           2449194
		ArgOfPericenter 283
		MeanAnomaly     0
	}
}

Star	"HD 74918 Ab"
{
	ParentBody     "HD 74918 A"
	Class          "M8.5 V"

	Orbit
	{
		PeriodDays      1592
		Eccentricity    0.4
		Inclination     58
		AscendingNode   91
		Epoch           2449194
		ArgOfPericenter 103
		MeanAnomaly     0
	}
}

Star	"HD 74918 B"
{
	ParentBody     "HD 74918"
	Class          "A4.4 V"

	/* BinaryOrbit
	{
		Epoch           2457388.4085786
		Separation      1661.6
		PositionAngle   266
	} */
}

// 外厨增十四(**)
Remove "18 Pup A"{ParentBody "18 Pup"}
Remove "18 Pup B"{ParentBody "18 Pup"}
Star	"18 Pup A/GJ 9255 A/NLTT 19073"
{
	ParentBody     "HD 68146"
	Class          "F6.5V"
	MassSol        1.17
	RadSol         1.3
	Luminosity     2.8
	Teff           6260
	FeH            -0.09
	Age            0.31

	BinaryOrbit
	{
		Separation      2059.13
	}
}

Star	"18 Pup B/GJ 9255 B/NLTT 19072"
{
	ParentBody     "HD 68146"
	Class          "M2V"
	MassSol        0.76
	Teff           3660

	/* BinaryOrbit
	{
		Separation      2059.13
	} */
}

// 外厨增十六(**)
Star	"HD 68290 A"
{
	ParentBody     "HD 68290"
	Class          "G9III-IIIb"
	MassSol        1.05
	RadSol         8.9
	Luminosity     43.31
	Teff           4750
	FeH            0.06
	Age            0.955

	BinaryOrbit
	{
		Separation      113.82
	}
}

Star	"HD 68290 B"
{
	ParentBody     "HD 68290"
	Class          "F4.4 V"

	/* BinaryOrbit
	{
		Separation      113.82
	} */
}

// 天记增一(**)
Remove "PSI Vel A"{ParentBody "PSI Vel"}
Remove "PSI Vel B"{ParentBody "PSI Vel"}
Star	"HD 82434 A"
{
	ParentBody     "HD 82434"
	Class          "F0IV"
	MassSol        1.44
	Teff           7122
	FeH            0
	Age            0.889

	Orbit
	{
		Period          33.95
		Eccentricity    0.433
		Inclination     58
		AscendingNode   291
		Epoch           2440470.38993106
		ArgOfPericenter 224.3
		MeanAnomaly     0
	}
}

Star	"HD 82434 B"
{
	ParentBody     "HD 82434"
	Class          "F3IV"

	Orbit
	{
		Period          33.95
		Eccentricity    0.433
		Inclination     58
		AscendingNode   291
		Epoch           2440470.38993106
		ArgOfPericenter 44.3
		MeanAnomaly     0
	}
}
