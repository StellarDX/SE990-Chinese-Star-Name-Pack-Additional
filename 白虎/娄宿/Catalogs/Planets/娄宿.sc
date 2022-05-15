// 娄宿增一(SB**)
Remove "IOT Ari A"{ParentBody "IOT Ari"}
Remove "IOT Ari B"{ParentBody "IOT Ari"}
Star "HD 11909 A"
{
	ParentBody "HD 11909"
	Class      "K1IIIp" // G8III
	MassSol    3.17
  RadSol     20
  Luminosity 240
  Teff       5031
  FeH        -0.1

	Orbit
	{
		PeriodDays      1567.66
		Eccentricity    0.356
    Epoch           2420961.1
		ArgOfPericenter 274.04
		MeanAnomaly     0
    //SemiAmplitude   10.78
	}
}

Star "HD 11909 B"
{
	ParentBody "HD 11909"
	Class      "WD"

	Orbit
	{
    PeriodDays      1567.66
		Eccentricity    0.356
    Epoch           2420961.1
		ArgOfPericenter 94.04
		MeanAnomaly     0
	}
}

// 娄宿增五(PM**)
Remove "LAM Ari A"{ParentBody "LAM Ari"}
Remove "LAM Ari B"{ParentBody "LAM Ari"}
Star "HD 11973 A"
{
	ParentBody "HD 11973"
	Class      "F0V"
  Teff       7177
  FeH        0.01

	BinaryOrbit
	{
    Separation      1477.3
	}
}

Star "HD 11973 B"
{
	ParentBody "HD 11973"
	Class      "G1V"
  Teff       5929
  FeH        -0.03

  /*BinaryOrbit
	{
    Separation      1477.3
	}*/
}

// 娄宿增六(SB**)
Star "HD 11443 A"
{
	ParentBody "2 Tri"
	Class      "F5III" // F6IV
	MassSol    1.7
  RadSol     3.22
  Teff       6288
  FeH        -0.09 // 0
  Age        1.6

	Orbit
	{
		PeriodDays      1.736
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HD 11443 B"
{
	ParentBody "2 Tri"
	Class      "M"
  MassSol    0.11

  Orbit
	{
		PeriodDays      1.736
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 娄宿增七(**)
Star "HD 12558 A"
{
	ParentBody "HD 12558"
	Class      "F8IV"
  FeH        -0.1
  Age        1.9

	Orbit
	{
		Period          325
    Eccentricity    0.59
    Inclination     51
    AscendingNode   20.5
    Epoch           2426561.96700148
		ArgOfPericenter 345
		MeanAnomaly     0
	}
}

Star "HD 12558 B"
{
	ParentBody "HD 12558"
	Class      "F9V"

  Orbit
	{
    Period          325
    Eccentricity    0.59
    Inclination     51
    AscendingNode   20.5
    Epoch           2426561.96700148
		ArgOfPericenter 165
		MeanAnomaly     0
	}
}

// 娄宿增十一(SB**)
// 质量比为1.03
Star "HD 12869 A"
{
	ParentBody "HD 12869"
	Class      "A2m"
  Luminosity 25
  Teff       8700
  FeH        0.18

	Orbit
	{
		PeriodDays      15.2938
    Eccentricity    0.61
    Epoch           2421844.121
		ArgOfPericenter 178.3
		MeanAnomaly     0
    //SemiAmplitude   34.5
	}
}

Star "HD 12869 B"
{
	ParentBody "HD 12869"
	Class      "Am"

  Orbit
	{
    PeriodDays      15.2938
    Eccentricity    0.61
    Epoch           2421844.121
		ArgOfPericenter 358.3
		MeanAnomaly     0
    //SemiAmplitude   35.4
	}
}

// 娄宿增十三(**)
Star "HD 14191 A"
{
	ParentBody "HD 14191"
	Class      "A1Vn"
  MassSol    2.1 // 2.94
  RadSol     1.9 // 2.5
  Luminosity 106
  Teff       9500
  Age        0.107

  Orbit
	{
		RefPlane        "Equator"
		Period          0.437736158
		Eccentricity    0.302295089
		Inclination     1.19580758
		AscendingNode   0
		ArgOfPericenter 57.6538701
		MeanAnomaly     116.019028
	}
}

Star "HD 14191 B"
{
	ParentBody "HD 14191"
	Class      ""
  MassSol    1
  Teff       5578
  FeH        0

  Orbit
	{
		RefPlane        "Equator"
		Period          0.437736158
		Eccentricity    0.302295089
		Inclination     1.19580758
		AscendingNode   0
		ArgOfPericenter 237.65387
		MeanAnomaly     116.019028
	}
}

// 天大将军增三(**)
Remove "OME And A"{ParentBody "OME And"}
Remove "OME And B"{ParentBody "OME And"}
Star "HD 8799 A"
{
	ParentBody "HD 8799"
	Class      "F3V"
	MassSol    0.963
	RadSol     2.2
	Luminosity 7.1
	Teff       6628
	FeH        -0.16
	Age        2.1

	BinaryOrbit
	{
		Separation      19.2671
	}
}

Star "HD 8799 B"
{
	ParentBody "HD 8799"
	Class      "F5V"
	MassSol    0.86

	/*BinaryOrbit
	{
		Separation      19.2671
	}*/
}

// 天大将军增五(V**)
Star "HD 12471 A"
{
	ParentBody "HD 12471"
	Class      "A2V"
	MassSol    2.75
	RadSol     3.28
	Luminosity 93
	Teff       10000
	Age        0.6

	BinaryOrbit
	{
		Separation      468
	}
}

Star "HD 12471 B"
{
	ParentBody "HD 12471"
	Class      "F1.3 V"

	/*BinaryOrbit
	{
		Separation      468
	}*/
}

// 天大将军增六(****)
// NOIRLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=10280
Remove "IOT Tri A"{ParentBody "IOT Tri"}
Remove "IOT Tri B"{ParentBody "IOT Tri"}
Remove "IOT Tri Aa"{ParentBody "IOT Tri A"}
Remove "IOT Tri Ab"{ParentBody "IOT Tri A"}
Remove "IOT Tri Ba"{ParentBody "IOT Tri B"}
Remove "IOT Tri Bb"{ParentBody "IOT Tri B"}
Barycenter "HD 13480 A"
{
	ParentBody "HD 13480"
	BinaryOrbit
	{
		Period          2300 // STF_227 Gaia pos.
		Separation      351.105
	}
}

Barycenter "HD 13480 B"
{
	ParentBody "HD 13480"
	/*BinaryOrbit
	{
		Period          2300
		Separation      351.105
	}*/
}

// Aab: twin PMS contact binary? DR2: plx(B)=11.53mas/PM(B)=[-60.5,-57.3]
Star "HD 13480 Aa"
{
	ParentBody "HD 13480 A"
	Class      "G0III"
	MassSol    2.5
	Luminosity 84
	FeH        -0.48

	Orbit // SB 112 + ApJ 509 L45 1998
	{
		PeriodDays      14.732
		Epoch           2422243.6
		Eccentricity    0.04
		AscendingNode   80
		ArgOfPericenter 5.4
		Inclination     55.4
		MeanAnomaly     0
	}
}

Star "HD 13480 Ab"
{
	ParentBody "HD 13480 A"
	Class      "G5III"
	MassSol    2.43

	Orbit
	{
		PeriodDays      14.732
		Epoch           2422243.6
		Eccentricity    0.04
		AscendingNode   80
		ArgOfPericenter 185.4
		Inclination     55.4
		MeanAnomaly     0
	}
}

Star "HD 13480 Ba"
{
	ParentBody "HD 13480 B"
	Class      "F5V"
	MassSol    1.58

	Orbit // SB9_113 1936ApJ....84...85L
	{
		PeriodDays      2.2365
		Epoch           2422654.219
		Eccentricity    0
		AscendingNode   0
		ArgOfPericenter 180
		Inclination     0
		MeanAnomaly     0
	}
}

Star "HD 13480 Bb"
{
	ParentBody "HD 13480 B"
	Class      ""
	MassSol    1.56

	Orbit
	{
		PeriodDays      2.2365
		Epoch           2422654.219
		Eccentricity    0
		AscendingNode   0
		ArgOfPericenter 0
		Inclination     0
		MeanAnomaly     0
	}
}

// 天大将军增八(SB**)
Star	"HD 15656 A"
{
	ParentBody     "HD 15656"
	Class          "K5III"

	Orbit
	{
		RefPlane        "Equator"
		Period          7863.34261
		Eccentricity    0.577057004
		Inclination     1.04818404
		AscendingNode   0
		ArgOfPericenter -30.0276701
		MeanAnomaly     129.287842
	}
}

Star	"HD 15656 B"
{
	ParentBody     "HD 15656"
	Class          "A6.1 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          7863.34261
		Eccentricity    0.577057004
		Inclination     1.04818404
		AscendingNode   0
		ArgOfPericenter 149.97233
		MeanAnomaly     129.287842
	}
}

// 天大将军增十(**)
Star "59 And A/GC 2600/HD 13294/HIP 10176/HR 628/SAO 55330"
{
	ParentBody "WDS J02109+3902"
	Class      "B9V"
	RadSol     2.73
	Luminosity 83.97
	Teff       10780

	BinaryOrbit
	{
		Epoch           2457753.65077738
		Separation      1370
		PositionAngle   36
	}

	/*BinaryOrbit
	{
		Epoch           2372286.97626262
		Separation      1370
		PositionAngle   35
	}*/
}

Star "59 And B/GC 2602/HD 13295/HIP 10180/HR 629/SAO 55331"
{
	ParentBody "WDS J02109+3902"
	Class      "A1Vn"
	MassSol    2.23
	RadSol     2.59
	Luminosity 30.4
	Teff       9598

	/*BinaryOrbit
	{
		Epoch           2457753.65077738
		Separation      1370
		PositionAngle   36
	}

	BinaryOrbit
	{
		Epoch           2372286.97626262
		Separation      1370
		PositionAngle   35
	}*/
}

// 天大将军增十二(SB***)
Barycenter "HD 13520 AB"
{
	ParentBody "HD 13520"
	BinaryOrbit
	{
		Separation      35.1988
	}
}

Star "HD 13520 A"
{
	ParentBody "HD 13520 AB"
	Class      "K3.5IIIBa0.4"
	MassSol    2
	Teff       4054
	FeH        -0.13

	Orbit
	{
		PeriodDays      748.2
		Eccentricity    0.8
		Inclination     54.1
		AscendingNode   344.5
		Epoch           2437886.5
		ArgOfPericenter 178
		MeanAnomaly     0
		//SemiAmplitude   4.88
	}
}

Star "HD 13520 B"
{
	ParentBody "HD 13520 AB"
	Class      "WD"
	MassSol    0.5

	Orbit
	{
		PeriodDays      748.2
		Eccentricity    0.8
		Inclination     54.1
		AscendingNode   344.5
		Epoch           2437886.5
		ArgOfPericenter 358
		MeanAnomaly     0
	}
}

Star	"HD 13520 C"
{
	ParentBody     "HD 13520"
	Class          "B9.1 V"

	/*BinaryOrbit
	{
		Separation      35.1988
	}*/
}

// 天大将军增十六(SB**)
Star "HD 11291 A"
{
	ParentBody "HD 11291"
	Class      "B9IIIpHgMn"
	Luminosity 145.3
	Teff       9412

	Orbit
	{
		PeriodDays      5.62698
		Eccentricity    0.024
		Epoch           2440281.3
		ArgOfPericenter 208
		MeanAnomaly     0
		//SemiAmplitude   26.5
	}
}

Star "HD 11291 B"
{
	ParentBody "HD 11291"
	Class      "A4.1 V"

	Orbit
	{
		PeriodDays      5.62698
		Eccentricity    0.024
		Epoch           2440281.3
		ArgOfPericenter 28
		MeanAnomaly     0
	}
}

// 左更增二(PM**)
Star "HD 17459 A"
{
	ParentBody "HD 17459"
	Class      "K1III"
	MassSol    1.6
	RadSol     19.74
	Luminosity 127.98
	Teff       4473
	FeH        -0.21
	Age        2.63

	BinaryOrbit
	{
		Separation      27.1994
	}
}

Star "HD 17459 B"
{
	ParentBody "HD 17459"
	Class      "A2.8 V"

	/*BinaryOrbit
	{
		Separation      27.1994
	}*/
}

// 左更增四(PM**)
Remove "RHO3 Ari A"{ParentBody "RHO3 Ari"}
Remove "RHO3 Ari B"{ParentBody "RHO3 Ari"}
Star "HD 18256 A"
{
	ParentBody "HD 18256"
	Class      "F6V"
	Teff       6380
	FeH        0.23
	Age        2.4

	BinaryOrbit
	{
		Separation      27.1994
	}
}

Star "HD 18256 B"
{
	ParentBody "HD 18256"
	Class      "G3.5 V"

	/*BinaryOrbit
	{
		Separation      27.1994
	}*/
}

// 左更增七(**)
Remove "EPS Ari (AB)"{ParentBody "EPS Ari"}
Remove "EPS Ari C"{ParentBody "EPS Ari"}
Remove "EPS Ari A"{ParentBody "EPS Ari (AB)"}
Remove "EPS Ari B"{ParentBody "EPS Ari (AB)"}
Star "EPS Ari A/HD 18520/HR 888/SAO 75673"
{
	ParentBody "ADS 2257"
	Class      "A2Vs"
	MassSol    2.4

	Orbit
	{
		Period          704.111
		Eccentricity    0.317
		Inclination     84.2
		AscendingNode   25.6
		Epoch           1978231.18566199
		ArgOfPericenter 342.1
		MeanAnomaly     0
	}
}

Star "EPS Ari B/HD 18519/HR 887"
{
	ParentBody "ADS 2257"
	Class      "A2Vs"
	MassSol    2.4

	Orbit
	{
		Period          704.111
		Eccentricity    0.317
		Inclination     84.2
		AscendingNode   25.6
		Epoch           1978231.18566199
		ArgOfPericenter 162.1
		MeanAnomaly     0
	}
}

// 天仓增二(***)
// NOIRLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=6226
Star "HD 8036 A"
{
	ParentBody "HD 8036"
	Class      "G8IV"
	MassSol    2.53
	RadSol     6.05
	Luminosity 40.79
	Teff       5895

	/*BinaryOrbit // Tok 2021
	{
		Period          1000
		Epoch           2337114.15252001
		Eccentricity    0.54
		AscendingNode   123.1
		ArgOfPericenter 102.8
		Inclination     37.9
		MeanAnomaly     0
	}*/
}

Barycenter "HD 8036 B"
{
	ParentBody "HD 8036"
	BinaryOrbit
	{
		Period          1000
		Epoch           2337114.15252001
		Eccentricity    0.54
		AscendingNode   123.1
		ArgOfPericenter 102.8
		Inclination     37.9
		MeanAnomaly     0
	}
}

// Tok 2020: orbit of B,C/DR2 plx=7.76 mss/wobble => masses 2.08/1.81 Msun.
Star "HD 8036 Ba"
{
	ParentBody "HD 8036 B"
	Class      "A(8)"
	MassSol    2.08

	Orbit // Tok 2021
	{
		Period          27.13
		Epoch           2449689.10302829
		Eccentricity    0.205
		AscendingNode   41.2
		ArgOfPericenter 163.2
		Inclination     18.5
		MeanAnomaly     0
	}
}

Star "HD 8036 Bb"
{
	ParentBody "HD 8036 B"
	Class      ""
	MassSol    1.81

	Orbit
	{
		Period          27.13
		Epoch           2449689.10302829
		Eccentricity    0.205
		AscendingNode   41.2
		ArgOfPericenter 343.2
		Inclination     18.5
		MeanAnomaly     0
	}
}

// 天仓增九(**)
Star "HD 7439"
{
	ParentBody "CCDM J01144-0755"
	Class      "F5V"
	MassSol    1.43
	RadSol     1.51
	Luminosity 4.08
	Teff       6760.83
	FeH        -0.3279021420642825355857806005508 // 0.47*Solar

	BinaryOrbit
	{
		Separation      1203.68
	}
}

Star "HD 7438"
{
	ParentBody "CCDM J01144-0755"
	Class      "K1V"

	/*BinaryOrbit
	{
		Separation      1203.68
	}*/
}

// 天仓增十九(*2Pl)
Remove "HD 1461 b"{ParentBody "HD 1461"}
Remove "HD 1461 c"{ParentBody "HD 1461"}
Planet	"HD 1461 b"
{
	ParentBody     "HR 72"
	DiscMethod     "RadVel"
	DiscDate       "2009" // Vogt et al./Keck Observatory/Anglo-Australian Observatory/2009.12.14
	Mass           2046.8147672

	Orbit
	{
		SemiMajorAxis   0.0634
		PeriodDays      5.77152
		Eccentricity    0.131
	}
}

Planet	"HD 1461 c"
{
	ParentBody     "HR 72"
	DiscMethod     "RadVel"
	DiscDate       "2011"
	Mass           1776.6606442

	Orbit
	{
		SemiMajorAxis   0.1117
		PeriodDays      13.5052
		Eccentricity    0.228
	}
}

// 天仓增廿一
// NOIRLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=8497
Barycenter "CHI Cet A/53 Cet/HD 11171/BD-11 352/FK5 1051/HIP 8497/HR 531/SAO 148036"
{
	ParentBody "CHI Cet"
	BinaryOrbit
	{
		Separation      4269.03 // Simbad Pos
		Period          160668
	}
}

Barycenter "CHI Cet BC/EZ Cet/HD 11131/BD-11 351/HIP 8486/SAO 148033"
{
	ParentBody "CHI Cet"
	/*BinaryOrbit
	{
		Separation      4269.03
		Period          160668
	}*/
}

Star "CHI Cet Aa"
{
	ParentBody "CHI Cet A"
	Class      "F3III"
	MassSol    1.36
	Luminosity 5.6
	Teff       6746
	FeH        0.14
	Age        1.2

	Orbit // VB6_Gln2007 EZ_Cet Gr.9
	{
		Period          6.765
		Epoch           2449312.90356355
		Eccentricity    0.45
		AscendingNode   333
		ArgOfPericenter 65
		Inclination     64
		MeanAnomaly     0
	}
}

Star "CHI Cet Ab(?)"
{
	ParentBody "CHI Cet A"
	Class      ""
	MassSol    0.58

	Orbit
	{
		Period          6.765
		Epoch           2449312.90356355
		Eccentricity    0.45
		AscendingNode   333
		ArgOfPericenter 245
		Inclination     64
		MeanAnomaly     0
	}
}

Star "CHI Cet B"
{
	ParentBody "CHI Cet BC"
	Class      "G3V"
	MassSol    0.99
	Teff       5804
	FeH        -0.09

	BinaryOrbit
	{
		Separation      157.296
		Period          1408
	}
}

Star "CHI Cet C"
{
	ParentBody "CHI Cet BC"
	Class      ""
	MassSol    0.43

	/*BinaryOrbit
	{
		Separation      157.296
		Period          1408
	}*/
}
